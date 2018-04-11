package dao.impl;

import dao.TeacherDAO;
import models.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TeacherDAOImpl implements TeacherDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Teacher> getAllTeachers() {
        return getCurrentSession().createQuery("from Teacher").list();
    }

    public Teacher getTeacherById(int id) {
        return getCurrentSession().get(Teacher.class, id);
    }

    public void addTeacher(Teacher teacher) {
        getCurrentSession().save(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        getCurrentSession().update(teacher);
    }

    public void deleteTeacher(int id) {
        getCurrentSession().delete(getTeacherById(id));
    }
}
