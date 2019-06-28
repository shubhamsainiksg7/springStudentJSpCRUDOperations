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


    @RequestMapping(value="/insertData",method = RequestMethod.POST)
    public ModelAndView insertData(@ModelAttribute("student") Student student){
        studentService.insertData(student);
        ModelAndView modelAndView = new ModelAndView("index");
        boolean insertStatus = studentService.insertData(student);
        String insertString = "inserted successfully";
        if(insertStatus == true){
            modelAndView.addObject("message", insertString);
        }else{
            modelAndView.addObject("mesaage","something wrong went");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/deletedata/{id}",method = RequestMethod.GET)
    public ModelAndView deleteStudent(@PathVariable String  id ){
        ModelAndView modelAndView = new ModelAndView("index");
        boolean deleteStatus = studentService.deleteData(id);
        String deleteString = "deleted successfully";
        if(deleteStatus == true) {
            modelAndView.addObject("message", deleteString);
        }else{
            modelAndView.addObject("message", "Somthing went wrong !");
        }
        return modelAndView;
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
       ModelAndView modelAndView = new ModelAndView("index");
        boolean updateStatus = studentService.updateData(student);
        String updateString = "updated successfully";
        if(updateStatus == true) {
            modelAndView.addObject("message", updateString);
        }else{
            modelAndView.addObject("message", "Somthing went wrong !");
        }
        return modelAndView;
    }


    @RequestMapping(value="/viewStudent")
    public ModelAndView displayStudentInfo() {
        List<Student> studentList =  studentService.displayData();
        ModelAndView result = new ModelAndView("viewStudent");
        result.addObject("students" , studentList);
        return result;
    }
}

