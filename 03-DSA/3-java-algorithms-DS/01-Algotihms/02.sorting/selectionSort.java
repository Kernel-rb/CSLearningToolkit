public class selectionSort {
  public static void main(String[] args) {
    
  }
  

  // O(n**2) 

  public static void selectionSortAl(int[] arr){
    for(int i = 0 ; i < arr.length ; i++){
      int lIdx = arr.length - i - 1; 
      int maxIdx = getMaxIndex(arr , 0 , lIdx);
      swap(arr , maxIdx  , lIdx );
    }
  }

  public static int getMaxIndex(int[] arr , int s , int e){
    int m = s;
    for(int i  = 0 ; i< arr.length ; i++){
      if(arr[i] > arr[m]){
        m = i;
      }
    }
    return m;
  }

  public static void swap(int[] arr , int f , int l ) {
    int temp = arr[f];
    arr[f] = arr[l];
    arr[l] = temp;
  }
}
