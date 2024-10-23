import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // int double float boolean 
        // Integer  Double Float Bolean 
        numbers.add(1);
        numbers.add(7);
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.set(2, 5);
        System.out.println(numbers.toString());
        numbers.sort(Comparator.reverseOrder());
        numbers.size(); // 5 , method to get the size of the list
        numbers.isEmpty(); // false , method to check if the list is empty
        numbers.contains(4); // true , method to check if the list contains a certain element
        numbers.remove(0);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(2));
        // numbers.clear();
        System.out.println(numbers.toString());

         numbers.forEach(i -> {
            i = i * 2;
            System.out.println(i);
         });
    }   
}
