package com.oop.first.codewgaes;

public class ModelClass {
    int real;
    int img;

    public ModelClass(int real, int img) {   //Constructor
        this.real = real;
        this.img = img;
    }

    public ModelClass() {
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

    @Override
    public String toString() { //to string
        return "Result:" + real + " + " + img + "i";
    }
}

