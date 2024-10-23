package Poly;

import java.util.ArrayList;
public class Dog {
    static String DEFAULT_NAME = "MAX";
    static double DEFAULT_WEIGHT = 1.75;
    static double DEFAULT_AGE = 0.5;
    static String DEFAULT_FOOD = "DEFAULT FOOD ";

    static final double WEIGHT_GAIN_INCREASE = 0.01;

    static  ArrayList<Dog> AllDogs = new ArrayList<Dog>();

    String name;
    String owner;
    double age;
    double weight;

    public Dog( String name, String owner , double age , double weight ){
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, double age){
        this(name , null , age , Dog.DEFAULT_WEIGHT);

    }

    public Dog(String name){
        this(name , null , Dog.DEFAULT_AGE , Dog.DEFAULT_WEIGHT);
    }

    public  Dog(){
        this(Dog.DEFAULT_NAME , null , Dog.DEFAULT_AGE , Dog.DEFAULT_WEIGHT);
    }

    public double eat(double amount , String food ){
        System.out.println(this.name + " " +  "is eating" + " "+ amount + " " + "of" + " " + food);
        double weightGained =  Dog.WEIGHT_GAIN_INCREASE * amount;
        this.weight +=  weightGained;
        return  this.weight;
    }

    public  double eat(double amount){
        return this.eat(amount , Dog.DEFAULT_FOOD);
    }

    public double eat(String amount){
        double returnVal = 0.0;
        try {
            double amountAsDouble = Double.parseDouble(amount);
            returnVal = this.eat(amountAsDouble);
        }catch (NumberFormatException e){
            System.out.println(amount + " : cant be parsed as a Double");
        }
        return  returnVal;
    }

    public  static void addDog(Dog dog){
        Dog.AllDogs.add(dog);
    }

    public static void printAllDogs(){
        System.out.println("ALL DOGS: ");
        System.out.println("------------------------------");
        for (Dog allDog : AllDogs) {
            System.out.println(allDog);
            System.out.println("------------------------------");
        }
    }
    public double getWeight() {
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setOwner(String owner){
        this.owner = owner;
    }

    public  String toString(){
        return "Name : " + this.name + "\n" + "Owner : " + this.owner + "\n" + "Age : " + this.age + "\n" + "weight : " + this.weight;
    }
    public static void main(String[] args){
         Dog dog1 = new Dog("Mikasse" , "Kernel" , 0.9 , 1.80);
         Dog.addDog(dog1);
         Dog dog2 = new Dog("Zoo" , 0.3);
         Dog.addDog(dog2);
         Dog dog3 = new Dog();
         Dog.addDog(dog3);
         Dog.printAllDogs();


        //System.out.println(dog1);

        //  eat :
        dog1.eat(12 , "Chicken");
        System.out.println(dog1);

        dog2.eat("6");
        dog3.eat("TRIGGER THE TRY CATCH");
        dog3.eat(4);

     }
}
