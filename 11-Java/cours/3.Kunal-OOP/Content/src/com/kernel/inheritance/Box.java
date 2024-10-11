package com.kernel.inheritance;

public class Box {
    private double l;
    private double h;
    private double w;
    Box(){
        super(); // ref to object class
        this.h = -1 ;
        this.l = -1 ;
        this.w = -1 ;
    }
    Box( double l , double h , double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
    // Cube
    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(Box box){
        this.h = box.h;
        this.l = box.l;
        this.w = box.w;
    }

    public void displayInfo(){
        System.out.println(this.h + " " + this.l + " " + this.w);
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setW(double w) {
        this.w = w;
    }
}




