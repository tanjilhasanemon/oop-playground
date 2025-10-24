package com.oop.first.addstudentnameid;

public class Student {
    private int id;
    private String name;
    private float cgpa;
    private String major;

    public Student(int id, float cgpa, String name, String major) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", major='" + major + '\'' +
                '}';
    }
}
