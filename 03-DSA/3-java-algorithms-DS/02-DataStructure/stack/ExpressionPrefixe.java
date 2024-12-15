package stack;
import java.util.*;

public class ExpressionPrefixe {
    public static void main(String[] argv) throws Exception {
        char[] arr = { '2' , '3' , '+' , '5' , '*' };
        int somme = rr(arr);
        System.out.println(somme);

    }

    public static int rr(char[] arr) throws Exception {
        Stack<Integer> s = new Stack<Integer>();

        for(char c : arr){
            if( Character.isDigit(c)){
                int cToInt  = c - '0';
                s.add(cToInt);
            }else{
                if(s.isEmpty()) System.out.println("Stack is Empty");
                int a =  s.pop();
                int b =  s.pop();
                int y = 0;
                switch(c){
                    case '+' : 
                    y =  a + b;
                    s.push(y);
                    break;
                    case '-': 
                        y =  a - b;
                        s.push(y);
                        break;
                    case  '*' :
                        y =  a *  b;
                        s.push(y);
                        break;
                    case '/' : 
                        if( b == 0) throw new Exception("U can't divide by 0");
                        y = a / b; 
                        s.push(y);
                    default: 
                        System.out.println("Invalid operation");
                }
            }
        }
        return s.pop();
    }

}
