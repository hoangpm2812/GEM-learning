package controllers;

import models.Cate;
import models.Classm;
import models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import services.CateService;
import services.ClassmService;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CateService cateService;

    @RequestMapping("/")
    public ModelAndView homePage(){
        ModelAndView modelAndView = new ModelAndView("blank");
        modelAndView.addObject("groups", cateService.getAllCates());
        return modelAndView;
    }

}
