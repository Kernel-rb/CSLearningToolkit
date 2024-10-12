public abstract class Parent {
    // We cannot create an object of an abstract class
    private int numberOfChildren;
    final int NONAME;
    static boolean parentClass = true ;
    abstract void career(String name);
    abstract void univ(String name);
    public Parent(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
        this.NONAME = 6546;
    }
    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
    public int getNumberOfChildren() {
        return numberOfChildren;
    }
    public static void greet() {
            System.out.println("Hi, we are parents");
    }
}
