package com.oop.sectionone.testingscope;

public class Polygon {
    protected int noOfSides;
    protected float area;

    public Polygon(int noOfSides, float area) {
        this.noOfSides = noOfSides;
        this.area = area;
    }

    public void showData(){
        System.out.println(noOfSides + "" + area);
    }
}
