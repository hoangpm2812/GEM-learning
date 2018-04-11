package dao.impl;


import config.AppConfig;
import dao.CateDAO;
import models.Cate;
import org.hibernate.Criteria;
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
public class CateDAOImpl implements CateDAO {

    @Autowired
    public SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Cate> getAllCates() {
        Criteria cr = getCurrentSession().createCriteria(Cate.class);
        return getCurrentSession().createQuery("from Cate").list();
    }

    public Cate getCateById(int id) {
        return getCurrentSession().get(Cate.class, id);
    }

    public void addCate(Cate cate) {
        getCurrentSession().save(cate);
    }

    public void updateCate(Cate cate) {
        getCurrentSession().update(cate);
    }

    public void deleteCate(int id) {
        getCurrentSession().delete(getCateById(id));
    }

    public boolean cateExists(String name) {
        String hql = "from Cate where username = :username";
        Query query = (Query) getCurrentSession().createQuery(hql);
        query.setParameter("username", name);
        List<Cate> list = query.getResultList();
        return list.size() > 0 ? true : false;
    }

}
