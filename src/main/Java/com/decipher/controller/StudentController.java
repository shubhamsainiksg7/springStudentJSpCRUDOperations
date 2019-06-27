package com.decipher.controller;
import com.decipher.model.Student;
import com.decipher.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

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

    @RequestMapping(value="/insertData",method = RequestMethod.POST)
    public ModelAndView insertData(@ModelAttribute("student") Student student){
        studentService.insertData(student);
        return new ModelAndView("index");
    }

/*    @RequestMapping(value = "/deletestudent", method = RequestMethod.POST)
    public ModelAndView deleteStudentRecord() {
        return new ModelAndView("deleteStudent");
    }*/
    /*@RequestMapping(value="/deletedata",method = RequestMethod.POST)
    public ModelAndView deleteData(@ModelAttribute("student") Student student){
        studentService.deleteData(student);
        return new ModelAndView("index");
    }*/
    @RequestMapping(value = "/deletedata/{id}",method = RequestMethod.GET)
    public ModelAndView deleteStudent(@PathVariable String  id ){
        ModelAndView modelAndView = new ModelAndView("index");
        boolean deleteStatus = studentService.deleteData(id);
        modelAndView.addObject(deleteStatus);
            return modelAndView;
    }
    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    public ModelAndView updateStudentRecord() {
        return new ModelAndView("viewStudent");
    }

    @RequestMapping(value="/updatedata/{id}",method = RequestMethod.GET)
    public ModelAndView getDataForUpdateStudent(@PathVariable String id ) {
        Student student = studentService.getDataForUpdateStudent(id);
        ModelAndView result = new ModelAndView("updateStudent");
        result.addObject("student" , student);
        return result;
    }
    @RequestMapping(value="/updatedata",method = RequestMethod.POST)
    public ModelAndView updatedata(@ModelAttribute("student") Student student) {
       studentService.updateData(student);
        return new ModelAndView("index");
    }




    @RequestMapping(value="/viewStudent")
    public ModelAndView comments() {
        List<Student> studentList =  studentService.displayData();
        ModelAndView result = new ModelAndView("viewStudent");
        result.addObject("students" , studentList);
        return result;
    }
}

