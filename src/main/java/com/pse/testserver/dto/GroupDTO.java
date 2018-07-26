package com.pse.testserver.dto;

import java.util.List;

public class GroupDTO {

    private int id;
    private String name;
    private String description;
    private UserDTO creator;
    private CategoryDTO category;
    private SubcategoryDTO subcategory;
    private String image_url;
    private List<UserDTO> members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getCreator() {
        return creator;
    }

    public void setCreator(UserDTO creator) {
        this.creator = creator;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public SubcategoryDTO getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(SubcategoryDTO subcategory) {
        this.subcategory = subcategory;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List<UserDTO> getMembers() {
        return members;
    }

    public void setMembers(List<UserDTO> members) {
        this.members = members;
    }
}
