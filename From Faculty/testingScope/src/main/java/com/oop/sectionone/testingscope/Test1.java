package com.oop.sectionone.testingscope;

public class Test1 {
    void someMethod(){
        Polygon p1 = new Polygon(4, 3.77f);
        p1.noOfSides = 15;
        System.out.println(p1.noOfSides);
        //System.out.println(p1.area);
        p1.showData();
        Triangle t1 = new Triangle(3, 6.77f, true);
        t1.showData();
    }
}
