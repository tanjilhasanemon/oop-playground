package com.oop.sectionsix.complexnooperation1;

public class ComplexNo {
    int real;
    int img;

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNo() {
    }

    @Override
    public String toString() {
        return "ComplexNo{" + real + " + " + img + "i"+ '}';
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    ComplexNo add(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    ComplexNo sub(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }
}
