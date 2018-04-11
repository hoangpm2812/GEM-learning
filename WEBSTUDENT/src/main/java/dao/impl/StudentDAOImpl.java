package dao.impl;

import dao.StudentDAO;
import models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Student> getAllStudents() {
        return getCurrentSession().createQuery("from Student").list();
    }

    public Student getStudentById(int id) {
        return getCurrentSession().get(Student.class, id);
    }

    public void addStudent(Student student) {
        getCurrentSession().save(student);
    }

    public void updateStudent(Student student) {
        getCurrentSession().update(student);
    }

    public void deleteStudent(int id) {
        getCurrentSession().delete(getStudentById(id));
    }
}
