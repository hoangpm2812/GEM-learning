package dao.impl;

import config.AppConfig;
import dao.CateDAO;
import dao.ClassmDAO;
import models.Cate;
import models.Classm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class ClassmDAOImpl implements ClassmDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Classm> getAllClasses() {
        return getCurrentSession().createQuery("from Classm").list();
    }

    public Classm getClassById(int id) {
        return getCurrentSession().get(Classm.class, id);
    }

    public void addClass(Classm classm) {
        getCurrentSession().save(classm);
    }

    public void updateClass(Classm classm) {
        getCurrentSession().update(classm);
    }

    public void deleteClass(int id) {
        getCurrentSession().delete(getClassById(id));
    }

    public boolean classExists(String name) {
        String hql = "from Classm where name = :name";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("name", name );
        return query.getResultList().size() > 0 ? true : false;
    }

    public List<Classm> getClassesByGroup(Cate cate) {
        return getCurrentSession().createQuery("from Classm where cate = :cate")
                .setParameter("cate", cate).list();
    }
}
