public class dataTypes {
    public static void main(String[] args) {
        // INTEGER
        byte aSingleByte = 127; // -128 to 127
        short  aShortInteger = 32767; // -32,768 to 32,767
        int anInteger = 2147483647; // -2,147,483,648 to 2,147,483,647
        long aLongInteger = 9223372036854775807L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // DECIMAL
        double aDouble = 123.456; // 64-bit IEEE 754 floating point
        float aFloat = 123.456f; // 32-bit IEEE 754 floating point

        // BOOLEAN
        boolean isPresent = true; // true or false
        boolean isAbsent = false; // true or false

        // CHARACTER
        char aCharacter = 'A'; // 16-bit Unicode character


        System.out.println("Byte: " + aSingleByte);
        System.out.println("Short: " + aShortInteger);
        System.out.println("Integer: " + anInteger);
        System.out.println("Long: " + aLongInteger);
        System.out.println("Double: " + aDouble);
        System.out.println("Float: " + aFloat);
        System.out.println("Boolean: " + isPresent);
        System.out.println("Boolean: " + isAbsent);
        System.out.println("Character: " + aCharacter);
    }    
}
