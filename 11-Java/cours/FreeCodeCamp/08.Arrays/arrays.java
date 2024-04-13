import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        vowels[0] = 'A';
        vowels[0] = 'a';
        System.out.println(Arrays.toString(vowels));    
        System.out.println(vowels.length);
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        char vowels2[] = Arrays.copyOf(vowels, vowels.length);
        System.out.println(Arrays.toString(vowels2));
        System.out.println(Arrays.equals(vowels, vowels2));
        System.out.println(Arrays.binarySearch(vowels, 'a'));

        // methods :
        // Arrays.toString(array) : returns a string representation of the array
        // Arrays.sort(array) : sorts the array in ascending order
        // Arrays.length(array) : returns the length of the array
        // Arrays.fill(array, value) : fills the array with the specified value$
        // Arrays.copyOf(array, length) : copies the specified array, truncating or padding with zeros to make the copy the specified length
        // Arrays.copyOfRange(array, start, end) : copies the specified range of the specified array into a new array
        // Arrays.equals(array1, array2) : returns true if the two specified arrays of objects are equal to one another
        // Arrays.binarySearch(array, value) : searches the specified array of objects for the specified value using the binary search algorithm
        // Arrays.asList(array) : returns a fixed-size list backed by the specified array
        // Arrays.deepToString(array) : returns a string representation of the "deep contents" of the specified array
        // Arrays.deepEquals(array1, array2) : returns true if the two specified arrays are deeply equal to one another
        // Arrays.deepHashCode(array) : returns a hash code based on the "deep contents" of the specified array
        // Arrays.deepCopy(array) : returns a copy of the specified array, not just a copy of the references to the objects in the array
        // Arrays.deepToString(array) : returns a string representation of the "deep contents" of the specified array

    }
}
    
