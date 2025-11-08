package com.oop.sectionone.studentmanagementsystem;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name, gender, skills, major;
    float cgpa;
    LocalDate dob;
    boolean hasScholarship;

    public Student(int id, String name, String gender, String skills, String major, float cgpa, LocalDate dob, boolean hasScholarship) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skills = skills;
        this.major = major;
        this.cgpa = cgpa;
        this.dob = dob;
        this.hasScholarship = hasScholarship;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", skills='" + skills + '\'' +
                ", major='" + major + '\'' +
                ", cgpa=" + cgpa +
                ", dob=" + dob +
                ", hasScholarship=" + hasScholarship +
                '}';
    }


    public String toString(String temp) {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + this.getAge() +
                ", dob=" + dob ;
    }

    int getAge(){
        int currentYear = LocalDate.now().getYear();
        return (currentYear - dob.getYear());
    }
}
