package com.decipher.model;

public class Student {
    private String id;
    private int age;
    private String name;
    private String fatherName;

    public void setId(String id ){
        this.id = id;
    }public void setName(String name) {
        this.name=name;
    }
    public void setFatherName(String fatherName){
        this.fatherName=fatherName;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getFatherName(){
        return fatherName;
    }
    public int getAge(){
        return age;
    }
}
