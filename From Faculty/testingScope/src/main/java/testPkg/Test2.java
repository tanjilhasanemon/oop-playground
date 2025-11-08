package testPkg;

import com.oop.sectionone.testingscope.Polygon;

public class Test2 extends Object{
    void TestMethod(){
        Polygon p1 = new Polygon(3, 7.66f);
        //System.out.println(p1.noOfSides);
        p1.showData();
    }

    @Override
    public String toString() {
        return "Test2{}";
    }

    int plusMethodInt(int x, int y){
        return x+y;
    }

    double plusMethodDouble(double x, double y){
        return x+y;
    }

    int plusMethod(int x, int y){
        return x+y;
    }

    double plusMethod(double x, double y){
        return x+y;
    }
}
