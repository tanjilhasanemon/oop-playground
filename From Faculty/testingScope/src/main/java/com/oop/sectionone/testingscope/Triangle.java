package com.oop.sectionone.testingscope;

public class Triangle extends Polygon{
    boolean isRightAngled;

    public Triangle(int noOfSides, float area, boolean isRightAngled) {
        super(noOfSides, area);
        this.isRightAngled = isRightAngled;
    }

    @Override
    public void showData(){
        System.out.println(noOfSides+""+area+isRightAngled);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "isRightAngled=" + isRightAngled +
                ", noOfSides=" + noOfSides +
                ", area=" + area +
                '}';
    }
}
