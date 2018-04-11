package services;

import models.Cate;

import java.util.List;

public interface CateService {
    List<Cate> getAllCates();
    Cate getCateById(int id);
    boolean addCate(Cate cate);
    void updateCate(Cate cate);
    void deleteCate(int id);
}
