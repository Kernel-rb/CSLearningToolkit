public class Child extends Parent {
    String name;
    int age;
    @Override
    void career(String name) {
        System.out.println("I am going to be an " + name);
    }
    @Override
    void univ(String name) {
        System.out.println("I'm a student at " + name);
    }

    public Child(int numberOfChildren , String name  , int age){
        super(numberOfChildren);
        this.name = name;
        this.age = age;
    }
}
