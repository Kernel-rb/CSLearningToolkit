package stack;
import java.util.*;

public class InverseStr {
    public static void main( String[] argv ){
        String sentence = "hello";
        System.out.println(rr(sentence));
    }

    public static String rr(String s){
        StringBuilder sb  =  new StringBuilder();
        Stack<Character> pile = new Stack<>();
        
        // bach n3mro stack dyalna 
        for(char c : s.toCharArray()){
            pile.add(c); 
        }

        while(!pile.empty()){
            sb.append(pile.pop());
        }

        return sb.toString();
    }

}
