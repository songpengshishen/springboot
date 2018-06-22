package com.wsp.controller;

import com.wsp.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class IndexController {

    @RequestMapping()
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("zhangsan",11,"男"));
        studentList.add(new Student("zhangsan",11,"男"));
        studentList.add(new Student("zhangsan",11,"男"));
        studentList.add(new Student("zhangsan",11,"男"));
        studentList.add(new Student("zhangsan",11,"男"));
        mv.addObject("students",studentList);
        mv.setViewName("/list");
        return mv;
    }
}
