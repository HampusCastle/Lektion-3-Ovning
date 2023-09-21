package com.Hampus.demo.Models;


public class Student {
    String name;
    public int age;

    public String toString(){
        return "Name: "+ name + "\n" + "Age: " + age;
    }

    public Student(String name, int age) {
        int current_year = 2023;
        this.name = name;
        this.age = age;
    }

    public int doubleMyAge(int age) {
        int doubleAge = age * 2;
        return doubleAge;
    }
}


//    public int getAge() {
//        return this.age;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }



