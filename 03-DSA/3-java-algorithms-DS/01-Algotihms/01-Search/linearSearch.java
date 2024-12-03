public class linearSearch {
  public static void main(String[] args) {
    int[] arr = {88 , -88 , 9985441 , 475 , 132 , 0 , 95, 10 , -9  };
    int[][] arr2 = {{12,14,5} , {78,45,96} , {0,17}};
    boolean check  = lSearch(arr , 0);
    boolean check2D = lSearch2D(arr2 , 96);
    System.out.println(check);
    System.out.println(check2D);
  }

  public static boolean lSearch(int[] arr , int target){
    if(arr.length == 0 ) return false;

    for(int i = 0 ; i < arr.length ; i++)
    {
      if(arr[i] == target) return true;
    }
    return false;
  }

  public static boolean lSearch(int[] arr , int target , int start , int  end) {
    if(start > end) return false;
    if(arr.length == 0 ) return false;
    for(int i = start ; i < end ; i++){
      if(arr[i] == target) return true;
    } 
    return false;
  }

  public static int findMinEL(int[] arr) {
    int min = arr[0];
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] < arr[0]){
        min = arr[i];
      }
    }
    return min;
  }

  public static boolean lSearch2D(int[][] arr2  , int target) {
    for(int i = 0 ; i < arr2.length ; i++){
      for(int j = 0 ; j < arr2[i].length ;j++){   
        if(arr2[i][j] == target) return true;
      }
    }
    return false;
  }
}
