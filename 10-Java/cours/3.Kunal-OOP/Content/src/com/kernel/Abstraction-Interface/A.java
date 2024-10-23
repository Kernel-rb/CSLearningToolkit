public interface A {
    // static method should have a body
    static void hy(){
        System.out.println("hy from interface A");
    }
    void fun();
}


class e {
    public static void main(String[] args) {
        A.hy();
    }
}