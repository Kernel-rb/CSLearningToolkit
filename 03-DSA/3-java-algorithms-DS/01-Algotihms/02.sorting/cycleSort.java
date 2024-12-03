import java.util.Arrays;

public class cycleSort {
    public static void main(String[] argv){
        int[] arr = {1,3,4,2,2}; 
        cyclicSort(arr);
       //  System.out.println(Arrays.toString(arr));
       for(int i = 1 ;  i < arr.length ; i++){
         System.out.println("i at " +  i + " : " + arr[i]);
       }
    }

   /* used on 1 to N problemes
    * @param arr an array of integers
    */
    public static  void cyclicSort(int[] arr){
        int i = 0; 
        while(i < arr.length){
            int correctIdx = arr[i] - 1; 
            if(arr[i]  != arr[correctIdx] ){
                    swap(arr , i , correctIdx); 
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}                                
