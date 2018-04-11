package controllers;

import models.Cate;
import models.Classm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.CateService;
import services.ClassmService;

import java.util.List;

@Controller
@RequestMapping("/groups")
public class ClassController {
    @Autowired
    private ClassmService classmService;
    @Autowired
    private CateService cateService;

    @RequestMapping("/{groupId}")
    public ModelAndView showClassByGroupId(@PathVariable int groupId){
        Cate cate = cateService.getCateById(groupId);
        List<Classm> classmList = classmService.getClassesByGroup(cate);
        for (Classm classm : classmList){
            classm.getCate();
        }
        ModelAndView modelAndView = new ModelAndView("classes");
        modelAndView.addObject("groups", cateService.getAllCates());
        modelAndView.addObject("classes", classmList);
        return modelAndView;
    }

    @RequestMapping(value = "/{groupId}/editClass/{classId}", method = RequestMethod.GET)
    public ModelAndView editClass(@PathVariable("classId") int classId){
        Classm classm = classmService.getClassByid(classId);
        Cate cate = classm.getCate();
        List<Cate> cateList = cateService.getAllCates();
        cateList.remove(cate);
        ModelAndView modelAndView = new ModelAndView("editClass");
        modelAndView.addObject("groups", cateList);
        modelAndView.addObject("command", classm);
        return modelAndView;
    }

    @RequestMapping(value = "/{groupId}/editClass/{classId}/edit", method = RequestMethod.POST)
    public ModelAndView editClass(@PathVariable("groupId") int groupId, @ModelAttribute Classm classm){
        return new ModelAndView("redirect:/groups/"+groupId);
    }
}
