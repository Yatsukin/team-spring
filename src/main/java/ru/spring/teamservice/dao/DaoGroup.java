package ru.spring.teamservice.dao;

import ru.spring.teamservice.model.Group;

import java.util.List;


public interface DaoGroup {

    List<Group> findAllGroups();

    boolean saveGroup(Group group);

    boolean updateGroup(Group group, int id);

    boolean deleteGroupById(int id);

}
