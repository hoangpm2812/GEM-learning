package dao;

import config.AppConfig;
import models.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDAOImpl {
    @Autowired
    private SessionFactory sessionFactory;

    public Student getStudentById(int id){
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDAOImpl dao = context.getBean(StudentDAOImpl.class);
        System.out.println(dao.getStudentById(1).getName());
    }
}
