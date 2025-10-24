package com.oop.first.student_info;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name, gender, major, skills;
    private float cgpa;
    private LocalDate dob;


    public Student(LocalDate dob, float cgpa, String skills, String major, String gender, String name, int id) {
        this.dob = dob;
        this.cgpa = cgpa;
        this.skills = skills;
        this.major = major;
        this.gender = gender;
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_view_ModelClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", skills='" + skills + '\'' +
                ", cgpa=" + cgpa +
                ", dob=" + dob +
                '}';
    }

}
