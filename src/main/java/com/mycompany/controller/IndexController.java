
package com.mycompany.controller;

import com.mycompany.model.Course;
import com.mycompany.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private CourseService courseService;
    
    public void setCourseService(CourseService courseService){
    this.courseService=courseService;
    
    }
    
    @RequestMapping (value = {"/","/index"},method = RequestMethod.GET)
    public ModelAndView index(){
    ModelAndView mv = new ModelAndView("index");
    return mv;
    
    }
    @RequestMapping(value = "/AddCourse", method=RequestMethod.GET)
    public ModelAndView addCourse(){
    ModelAndView mv = new ModelAndView("AddCourse");
    return mv;
    }
    @RequestMapping(value = "/SubmitAddCourse", method = RequestMethod.POST)
    public ModelAndView submitAddCourse(@ModelAttribute Course c){
    courseService.insert(c);
    return new ModelAndView("redirect:DisplayCourse");
    
    }
    
    @RequestMapping(value="/DisplayCourse", method=RequestMethod.GET)
    public ModelAndView displayCourse(){
        List<Course> courses=courseService.display();
        System.out.println(courses);
        ModelAndView mv=new ModelAndView("DisplayCourse");
        mv.addObject("courses",courses);
        return mv;
    }
//    @RequestMapping(value = "/DeleteCourse", method = RequestMethod.GET)
//    public ModelAndView deleteCourse(@RequestParam("cid") int courseid){
//        courseService.delete(courseid);
//    return new ModelAndView("redirect:DisplayCourse");
//    
//    
//    }
}

