package  stack;
import  stackAndQueue.CustomStack.java;
import java.util.*;

class StackAndQueue {
    public static void main(String[] args){
        // Stack : 
        // Stack<Integer> stack = new Stack<>();
        CustomStack stack = new CustomStack();
        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(24);
        stack.push(64);
        // Queue => interface
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(6);
        queue.add(2);
        // Deque => interface add or remove el from both side !! no null val :
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(8);
        deque.addLast(9);
        deque.removeLast(9);
        deque.removeFirst(8);

        // Output
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
