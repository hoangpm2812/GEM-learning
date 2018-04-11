package services.impl;

import dao.ClassmDAO;
import models.Cate;
import models.Classm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.ClassmService;

import java.util.List;

@Service
public class ClassmServiceImpl implements ClassmService {
    @Autowired
    private ClassmDAO classmDAO;

    public List<Classm> getAllClasses() {
        return classmDAO.getAllClasses();
    }

    public Classm getClassByid(int id) {
        return classmDAO.getClassById(id);
    }

    public boolean addClass(Classm classm) {
        if (classmDAO.classExists(classm.getName())){
            return false;
        } else {
            classmDAO.addClass(classm);
            return true;
        }
    }

    public void updateClass(Classm classm) {
        classmDAO.updateClass(classm);
    }

    public void deleteClass(int id) {
        classmDAO.deleteClass(id);
    }

    public List<Classm> getClassesByGroup(Cate cate) {
        return classmDAO.getClassesByGroup(cate);
    }
}
