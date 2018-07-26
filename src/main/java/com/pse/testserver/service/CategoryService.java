package com.pse.testserver.service;

import com.pse.testserver.dto.CategoryDTO;
import com.pse.testserver.entities.Category;
import com.pse.testserver.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class implementing the business logic regarding the Category entity, which includes (or may include
 * in future versions) searching, creating, modifying, deleting and other operations which the application needs
 * to perform on mainly category objects.
 * To perform these operations, methods of the injected repository class(es) are to be used.
 */
@Service
public class CategoryService {

    @Autowired
    ModelMapper modelMapper;

    /**
     * Injected CategoryRepository class dependency.
     */
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * @return list of all persisted categories.
     */
    @Transactional
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(category -> toDTO(category)).collect(Collectors.toList());
    }

    private CategoryDTO toDTO(Category category) {
        return modelMapper.map(category, CategoryDTO.class);
    }

}
