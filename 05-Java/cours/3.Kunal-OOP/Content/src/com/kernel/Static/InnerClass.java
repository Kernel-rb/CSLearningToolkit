package com.kernel.Static;

class Age  {
    static int  age;
    public  Age( int age){
        Age.age = age;
    }
}
public class InnerClass {
    static class  Name  {
        String name;
        public  Name( String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Name kernel = new  Name("kernel");
        Name Nadale = new  Name("Nadale");
        Age KernelAge = new Age(20);
        System.out.println(Age.age);


        System.out.println(kernel);
        System.out.println(Nadale);
    }
}
