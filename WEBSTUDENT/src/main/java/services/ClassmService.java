package services;

import models.Cate;
import models.Classm;

import java.util.List;

public interface ClassmService {
    List<Classm> getAllClasses();
    Classm getClassByid(int id);
    boolean addClass(Classm classm);
    void updateClass(Classm classm);
    void deleteClass(int id);
    List<Classm> getClassesByGroup(Cate cate);
}
