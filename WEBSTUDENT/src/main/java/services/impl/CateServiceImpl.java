package services.impl;

import dao.CateDAO;
import models.Cate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.CateService;

import java.util.List;

@Service
public class CateServiceImpl implements CateService {
    @Autowired
    private CateDAO cateDAO;

    public List<Cate> getAllCates() {
        return cateDAO.getAllCates();
    }

    public Cate getCateById(int id) {
        return cateDAO.getCateById(id);
    }

    public boolean addCate(Cate cate) {
        if (cateDAO.cateExists(cate.getName())){
            return false;
        } else {
            cateDAO.addCate(cate);
            return true;
        }
    }

    public void updateCate(Cate cate) {
        cateDAO.updateCate(cate);
    }

    public void deleteCate(int id) {
        cateDAO.deleteCate(id);
    }
}
