public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -22, 10, 15, 4587, 9999};
        int[] descArr = {99, 50, 1, -9};
        
        int target = 15; 
        int targetDesc = 50; 

        System.out.println("Target " + target + " found at index: " + determineOrder(arr, target));
        System.out.println("Target " + targetDesc + " found at index: " + determineOrder(descArr, targetDesc));
    }

    public static int determineOrder(int[] arr, int target) {
        if (arr[0] < arr[arr.length - 1]) {
            return binarySearch(arr, target);
        } else if (arr[0] > arr[arr.length - 1]) {
            return descBinarySearch(arr, target);
        } else {
            return -1;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid; 
            }
        }

        return -1; 
    }

    public static int descBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                end = mid - 1; 
            } else if (arr[mid] > target) {
                start = mid + 1; 
            } else {
                return mid; 
            }
        }
        
        return -1; 
    }
}

