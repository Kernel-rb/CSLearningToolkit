public class ObjectDemo {

    int n;

    public ObjectDemo(int n){
        this.n = n;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return this.n == ((ObjectDemo)obj).n;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public  String toString(){
        return super.toString();
    }

    /**
     * Garbage Collector
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo a = new ObjectDemo(34);
        ObjectDemo b = new ObjectDemo(34);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        // final => can't override it
        System.out.println(a.getClass());

    }
}

