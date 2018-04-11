package dao;


import models.Cate;

import java.util.List;

public interface CateDAO {
    List<Cate> getAllCates();
    Cate getCateById(int id);
    void addCate(Cate cate);
    void updateCate(Cate cate);
    void deleteCate(int id);
    boolean cateExists(String name);
}
