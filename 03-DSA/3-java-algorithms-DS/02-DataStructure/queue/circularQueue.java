package queue;
class circularQueue {

    protected int[] data;
    private static int DEFAULT_SIZE = 10;
    protected int start = 0;
    protected int end = 0;
    private int size  = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return size  == data.length - 1;
    }

    public boolean isEmpty(){
        return size  == 0;
    }

    public boolean insert(int v) {
        if(isFull()){
            return false;
        }
        data[end] = v;
        end++;
        end = end % data.length; 
        size++;
        retun true;
    }
    public  int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }
        int removed = data[start]; 
        start++;
        start = start % data.length;
        size--;
        return removed;
    }
    public  int head() throws Exception {
        if(isEmpty()) {
            throw new Exception("The queue is empty");
        }
        return data[start];
    }



}
