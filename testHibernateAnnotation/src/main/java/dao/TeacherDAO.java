package dao;

import config.AppConfig;
import models.Teacher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TeacherDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Teacher getTeacherById(int id){
        return sessionFactory.getCurrentSession().get(Teacher.class, id);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TeacherDAO dao = context.getBean(TeacherDAO.class);
        System.out.println(dao.getTeacherById(1).getName());
    }
}

