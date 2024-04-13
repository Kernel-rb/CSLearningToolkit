public class operators {
    public static void main(String[] args) {
        int a = 12 ;
        int b = 6 ;
        // addition
        System.out.println("The sum of a and b is " + (a+b));
        // subtraction
        System.out.println("The difference of a and b is " + (a-b));
        // multiplication
        System.out.println("The product of a and b is " + (a*b));
        // division
        System.out.println("The division of a and b is " + (a/b)); // th result will be 2 cuz both are integers
        // remainder
        System.out.println("The remainder of a and b is " + (a%b)); 
        // increment
        System.out.println("The increment of a is " + (++a));
        // decrement
        System.out.println("The decrement of a is " + (--a));
        
        // Arithmetic operators
        
        // As equals to
        System.out.println("Is a equals to b? " + (a==b));
        // Not equals to
        System.out.println("Is a not equals to b? " + (a!=b));
        // greater than
        System.out.println("Is a greater than b? " + (a>b));
        // less than
        System.out.println("Is a less than b? " + (a<b));
        // greater than or equals to
        System.out.println("Is a greater than or equals to b? " + (a>=b));
        // less than or equals to
        System.out.println("Is a less than or equals to b? " + (a<=b));

        
        // Logical operators

        // Logical AND
        System.out.println("Is a greater than b and a less than 10? " + (a>b && a<10));
        // Logical OR
        System.out.println("Is a greater than b or a less than 10? " + (a>b || a<10));
        // Logical NOT
        System.out.println("Is a greater than b? " + !(a>b));
    }
}

