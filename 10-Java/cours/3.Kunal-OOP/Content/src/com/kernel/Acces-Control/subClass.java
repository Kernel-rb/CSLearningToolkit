public class subClass extends A {
    public  subClass(int num , String name){
        super(num,name);
    }

    public static void main(String[] args) {
        subClass a1 = new subClass(2,"sub");
        System.out.println(a1.r);
        System.out.println(a1 instanceof subClass);
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof Object);
    }
}
