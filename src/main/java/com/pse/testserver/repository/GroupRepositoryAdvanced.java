package com.pse.testserver.repository;

import com.pse.testserver.entities.Category;
import com.pse.testserver.entities.Group;
import com.pse.testserver.entities.Post;
import com.pse.testserver.entities.User;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface GroupRepositoryAdvanced.
 */
public interface GroupRepositoryAdvanced{
    
    /**
     * find all groups containing the string word.
     *
     * @param word word to be searched in all groups names
     * @return {@linkplain java.util.List> of all groups containing the string word
     */
    List<Group> findAllByName(String word);
    
    /**
     * find all groups belonging to the specified category.
     *
     * @param category category of groups searched
     * @return {@linkplain java.util.List> of all groups that belong to the given category
     */
    List<Group> findAllByCategory(Category category);
    
    /**
     * find all groups containing the string word with the specified category.
     *
     * @param word word to be searched in all groups names
     * @param category category of groups searched
     * @return {@linkplain java.util.List> of all groups that belong to the given category
     */
    List<Group> findAllByNameSortedByCategory(String word, Category category);
    
    /**
     * find all members of group.
     *
     * @param group group to be searched in for members
     * @return {@linkplain java.util.List> of all members of the group
     */
    List<User> findJoinedUsers(Group group);
    
    /**
     * find all posts of group.
     *
     * @param group group to be searched in for posts
     * @return {@linkplain java.util.List> of all posts of the group
     */
    List<Post> findPost(Group group);
}
