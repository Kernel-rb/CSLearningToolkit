public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = {14 ,22 , 0 , 1 , 6 };
    bubbleSortAlgorihme(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void bubbleSortAlgorihme(int[]) arr){
    boolean swap;
    for(int i = 0 ; i < arr.length ; i++){
      swap = false;
      for(int j = 1  ; j < arr.length - i ; j++ ){
        if(arr[j] < arr[j - 1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          swap = true;
        }
      }
    }
    if(swap == false){
      break;
    }
  }
}
