package com.example.student_show_data;

public class student {
    private int id;
    private String name;
    private String major;
    private String gender;
    private boolean scholarship;


    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "Id=" + id + '\n' +
                        " Name=" + name + '\n' +
                        " Major=" + major + '\n' +
                " Gender=" + gender + '\n'+
                " Scholarship=" + scholarship ;
    }

    public student(int id, boolean scholarship, String gender, String name, String major) {
        this.id = id;
        this.scholarship = scholarship;
        this.gender = gender;
        this.name = name;
        this.major = major;



    }
}
