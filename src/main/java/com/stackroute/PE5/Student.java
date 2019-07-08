package com.stackroute.PE5;

public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId() {
        //get id
        return id;
    }

    public void setId(String id) {
        //set id
        this.id = id;
    }
    public String getName() {
        //get name
        return name;
    }

    public void setName(String name) {
        //set name
        this.name = name;
    }
    public int getAge() {
        //get age
        return age;
    }

    public void setAge(int age) {
        //set age
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
