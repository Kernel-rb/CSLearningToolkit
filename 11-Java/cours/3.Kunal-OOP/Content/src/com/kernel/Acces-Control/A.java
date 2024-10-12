public class A {
    private int num ;
    private String name;
    private int[] arr;
    protected int r = 0;
    // DEfault values
    private static final  int DEFAULT_NUMBER = -1;
    private static final  String DEFAULT_NAME = " ";
    private static final int[] DEFAULT_ARR = new int[0];
    public A(){
        this.num = DEFAULT_NUMBER;
        this.name = DEFAULT_NAME;
        this.arr = DEFAULT_ARR.clone();
    }
    public A(int num , String name ){
        this.num = num;
        this.name = name;
        this.arr = new  int[num];
    }

    public int getNum() {
        return num;
    }

    public static int getDefaultNumber() {
        return DEFAULT_NUMBER;
    }

    public int[] getArr() {
        return arr;
    }

    public static int[] getDefaultArr() {
        return DEFAULT_ARR;
    }

    public String getName() {
        return name;
    }

    public static String getDefaultName() {
        return DEFAULT_NAME;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

