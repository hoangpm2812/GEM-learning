package dao;

import models.Cate;
import models.Classm;

import java.security.acl.Group;
import java.util.List;

public interface ClassmDAO {
    List<Classm> getAllClasses();
    Classm getClassById(int id);
    void addClass(Classm classm);
    void updateClass(Classm classm);
    void deleteClass(int id);
    boolean classExists(String name);
    List<Classm> getClassesByGroup(Cate cate);
}
