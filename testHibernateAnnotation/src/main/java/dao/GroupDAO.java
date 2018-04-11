package dao;

import config.AppConfig;
import models.Group;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GroupDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Group getGroupById(int id){
        return sessionFactory.getCurrentSession().get(Group.class, id);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GroupDAO dao = context.getBean(GroupDAO.class);
        System.out.println(dao.getGroupById(1).getName());
    }
}
