package stack;
// import StackException.java;  // Si vous avez une exception personnalisée, décommentez cette ligne

public class  CustomStack{
    
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1; // track index
    
    public static void main(String[] args) {
        try {
            CustomStack stack = new CustomStack(5);
            stack.push(5);
            stack.push(15);
            stack.push(25);
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());          
        }
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    
    // Pousse un élément dans la pile
    public boolean push(int v) {
        if (isFull()) {
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr] = v;
        return true;
    }
    
    // Retire et retourne le dernier élément ajouté
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop() because: Stack is Empty");
        }
        return data[ptr--];
    }

    // Retourne le dernier élément ajouté sans le retirer
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot use peek function because: Stack is Empty");
        }
        return data[ptr];
    }

    // Vérifie si la pile est pleine
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    // Vérifie si la pile est vide
     public boolean isEmpty() {
        return ptr == -1;
    }
}

