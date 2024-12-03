package org.kernel;



public class Main {
    public static void main(String[] args)
    {
    }

    public  static void reverse(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            int temp  = arr[r];
            arr[r]  = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
    }

    public static int[][] flipAndInvertImage(int[][] image)
    {
        int[][] r = new int[image.length][image.length];
        for(int i = 0 ; i < image.length ; i++){
            reverse(image[i]);
            for(int j = 0 ; j < image[i].length ; j++){
                if(image[i][j] == 0  ){
                    r[i][j] = 1;
                }else {
                    r[i][j] = 0;
                }
            }
        }
        return r;
    }
}