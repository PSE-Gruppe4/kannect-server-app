package com.pse.testserver.service;

import com.pse.testserver.dto.GroupDTO;
import com.pse.testserver.entities.Group;
import com.pse.testserver.repository.GroupRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class implementing the business logic regarding the group entity, which includes (or may include
 * in future versions) searching, creating, modifying, deleting and other operations which the application needs
 * to perform on mainly group objects.
 * To perform these operations, methods of the injected repository class(es) are to be used.
 */
@Service
public class GroupService {

    /**
     * Injected GroupRepositoryAdvancedImpl class dependency.
     */


    /**
     * Injected GroupRepository class dependency.
     */
    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    ModelMapper modelMapper;

    /**
     * Method to look for groups, which include the given String in their names.
     *
     * @param name to look for.
     * @return list of wanted groups.
     */
    @Transactional
    public List<GroupDTO> getAllByName(String name) {
        return groupRepository.findAllByName(name).stream().map(group -> toDTO(group)).collect(Collectors.toList());
    }


    /**
     * Method to save a new group to the system.
     * @param group to be saved.
     */
    @Transactional
    public void createGroup(Group group) {
        groupRepository.save(group);
    }

    /**
     * Method to delete a group from the system.
     * @param group to be deleted.
     */
    @Transactional
    public void deleteGroup(Group group) {
        groupRepository.delete(group);
    }

    /**
     * Edits a group by saving the editedGroup received from the client.
     * @param editedGroup received from the client, has the edited attributes.
     */
    @Transactional
    public void editGroup(Group editedGroup) {
        groupRepository.save(editedGroup);
    }

    private GroupDTO toDTO(Group group) {
        return modelMapper.map(group, GroupDTO.class);
    }
}
