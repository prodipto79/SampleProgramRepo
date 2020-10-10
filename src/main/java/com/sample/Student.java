package com.sample;

public class Student {

    private String stuName;
    private String roll;
    private int age;


    public Student(String stuName, String roll, int age ){

        this.stuName = stuName;
        this.roll = roll;
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public String getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }



}
