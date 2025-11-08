package com.oop.sectionsix.complexnooperation;

public class ComplexNo {
    int real;
    int img;

    public ComplexNo(int real, int img) {
        this.img = img;
        this.real = real;
    }

    public ComplexNo() {
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "Result: " + real + " + " + img + "i";
    }
}
