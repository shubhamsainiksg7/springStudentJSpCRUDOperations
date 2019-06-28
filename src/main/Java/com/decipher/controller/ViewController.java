package com.decipher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @RequestMapping(value = "/")
    public ModelAndView welcome() {
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public ModelAndView method() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
    public ModelAndView addStudentRecord() {
        return new ModelAndView("addStudent");
    }
    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    public ModelAndView updateStudentRecord() {
        return new ModelAndView("viewStudent");
    }

}
