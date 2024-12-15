package stack;
import java.util.Stack;

public class validParen {
    public static void main(String[] argv) {
        String sentence = "{[()()]}";
        System.out.println(rr(sentence)); 
    }

    public static boolean rr(String sentence) {
        Stack<Character> s = new Stack<>();
        for (char c : sentence.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c); 
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char e = s.pop(); 
                if (!((e == '(' && c == ')') || (e == '{' && c == '}') || (e == '[' && c == ']'))) {
                    return false; 
                }
            }
        }
        return s.isEmpty();
    }
}

