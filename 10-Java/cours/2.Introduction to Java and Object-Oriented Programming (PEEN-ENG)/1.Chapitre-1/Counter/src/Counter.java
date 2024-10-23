public class Counter {
    int counter;
    public int increment(){
        this.counter++;
        return this.counter;
    }
    public int decrement(){
        this.counter--;
        return this.counter;
    }

    public int getCounter(){
        return  this.counter;
    }

}
