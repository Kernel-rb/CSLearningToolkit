public class binarySearch {
  public static void main(String[] args){
    int[] arr = {-11 , -22 , 10 , 15 , 4587 , 9999};
    int[] descArr = {99 , 50 , 1 , -9};
    int re = BinarySearch(arr , 9999);
    int descRe = DescBinarySearch(descArr , -9);
    System.out.println(descRe);
  }

  public static int BinarySearch(int[] arr  , int target) {
    int start = 0; 
    int end = arr.length - 1 ;
    while (start <= end) {
      int mid = start + (end - start) / 2; 
      if(arr[mid] > target){
        end = mid - 1;
      }else if(arr[mid] < target){
        start = mid + 1;
      }else{
        return mid;
      }
    }

    return -1;
  }

  public static int DescBinarySearch(int[] arr , int target){
    int start = 0; 
    int end = arr.length - 1 ;
    while (start <= end) {
      int mid = start + (end  - start ) / 2 ; 
      if(arr[mid] > target){
        start = mid + 1;
      }else if(arr[mid] < target){
        end = mid - 1;
      }else{
        return mid;
      }
    }
    return -1;
  }
}
