public class strings {
    public static void main(String[] args) {
        // Important : when we use new keywoards , the value of 2 objects will be different cuz they are stored in different memory locations.

        // String name = "kernel";
        String name = new String("kernel"); 
        String job = new String("Student");// %s is a placeholder for a string
        String school = new String("EPSI Paris");
        int age = 19; // %d is a placeholder for an integer
        int lenghtofString = name.length();
        String upperCase = school.toUpperCase();
        String real_name = new String("Saif");
        name.replace(name, real_name);

        String formattedString = String.format("My name is %s, I am %d years old, I am a %s at %s", name, age, job, upperCase);
        String formated_length = String.format("The length of the name is %d", lenghtofString);

        System.out.println(formattedString);
        System.out.println(formated_length);


        
        // %f is a placeholder for a float
        // %c is a placeholder for a character
        // %b is a placeholder for a boolean
        // %x is a placeholder for a hexadecimal number
        // %o is a placeholder for an octal number
        // %e is a placeholder for a scientific number
    }
}
