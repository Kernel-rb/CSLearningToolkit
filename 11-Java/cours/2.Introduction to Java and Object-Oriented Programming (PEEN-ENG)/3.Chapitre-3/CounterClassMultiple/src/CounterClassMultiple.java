public class CounterClassMultiple {
    int count;

    // Constructors

    public CounterClassMultiple(int start){
        this.count = start;
    }

    public  CounterClassMultiple(){
        this.count = 0;
    }
    public static void main(String[] args){
        CounterClassMultiple counter1 = new CounterClassMultiple(2);
        System.out.println(counter1.count);

        CounterClassMultiple counter2 = new CounterClassMultiple();
        System.out.println(counter2.count);
    }
}
