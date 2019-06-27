package com.decipher.service;

import com.decipher.model.Student;

import java.util.ArrayList;


public interface StudentService {

    void insertData(Student student);
    boolean updateData(Student student);
    boolean deleteData(String id);
    ArrayList<Student> displayData();
    Student getDataForUpdateStudent(String id);
}