package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    // test file
    public static void main(String[] args) {

        List<Student> obj = new ArrayList<Student>();
        String name;
        String roll;
        int age;

        for(int i = 0;i<4;i++){

            name = "Student name" + i;
            roll = "roll" + i;
            age = 12;
            Student stu = new Student(name,roll,age);
            obj.add(stu);
            System.out.println(stu.toString());

        }

        for(Student stu : obj){
            System.out.println(stu.getStuName());
        }




    }


}
