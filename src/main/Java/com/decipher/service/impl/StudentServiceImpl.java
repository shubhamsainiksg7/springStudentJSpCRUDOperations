package com.decipher.service.impl;

import com.decipher.model.Student;
import com.decipher.service.StudentService;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    private MongoClient mongo = new MongoClient("localhost", 27017);
    private MongoDatabase database = mongo.getDatabase("studentDetails");
    private MongoCollection<Document> collection = database.getCollection("studentCollection");


    public boolean insertData(Student student) {

        Document document = new Document("title", "MongoDB")
                .append("name", student.getName())
                .append("fatherName", student.getFatherName())
                .append("age", student.getAge());
        collection.insertOne(document);
        System.out.println("Document inserted successfully");
        return true;
    }


    public boolean deleteData(String id) {

        collection.deleteOne(new Document("_id", new ObjectId(id)));
        System.out.println("Document deleted successfully...");
        return true;
    }

    @Override
    public ArrayList<Student> displayData() {

        List<Document> documents = collection.find().into(new ArrayList<Document>());
        ArrayList<Student> list = new ArrayList();

        for (Document studentData : documents) {
            Student student = new Student();
            student.setId(studentData.get("_id").toString());
            student.setName((String) studentData.get("name"));
            student.setFatherName((String) studentData.get("fatherName"));
            student.setAge((Integer) studentData.get("age"));
            list.add(student);

        }
        return list;
        //return ArrayList;

    }

    @Override
    public Student getDataForUpdateStudent(String id) {
        List<Document> documents = collection.find().into(new ArrayList<Document>());
        ArrayList<Student> list = new ArrayList();
        Student student = new Student();
        for (Document studentData : documents) {
            if(studentData.get("_id").toString().equalsIgnoreCase(id)) {
                student.setId(studentData.get("_id").toString());
                student.setName((String) studentData.get("name"));
                student.setFatherName((String) studentData.get("fatherName"));
                student.setAge((Integer) studentData.get("age"));
            }

        }
        return student;
    }


    public boolean updateData(Student student) {


        //if (new ObjectId(student.getid()).equals("_id")) {
            if (student.getName() != null) {
                collection.updateOne(Filters.eq("_id", new ObjectId(student.getId())), Updates.set("name", student.getName()));
                System.out.println("name update successfully...");
            }
            if (student.getFatherName() != null) {
                collection.updateOne(Filters.eq("_id", new ObjectId(student.getId())), Updates.set("fatherName", student.getFatherName()));
                System.out.println("father name update successfully...");
            }
            if (student.getAge() != 0) {

                collection.updateOne(Filters.eq("_id", new ObjectId(student.getId())), Updates.set("age", student.getAge()));
                System.out.println("age update successfully...");
            }
            return true;
        }/* else {
            System.out.println("invalid");
            return false;
        }*/



    }

