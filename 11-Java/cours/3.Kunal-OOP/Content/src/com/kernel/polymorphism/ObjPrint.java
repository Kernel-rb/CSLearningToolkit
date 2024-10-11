package com.kernel.polymorphism;

public class ObjPrint {
    int nb;
    public ObjPrint(int nb){
        this.nb = nb;
    }

    @Override
    public  String toString(){
        return "Object num  : "+ this.nb;
    }

    public static void main(String[] args) {
        ObjPrint obj = new ObjPrint(5);
        System.out.println(obj);
    }
}
