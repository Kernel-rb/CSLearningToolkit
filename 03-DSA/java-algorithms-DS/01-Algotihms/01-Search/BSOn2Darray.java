import java.util.Arrays;

public class BSOn2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {9, 45, 65}};
        int target = 45;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    // binary search on r
    static int[] binarySearch(int[][] matrix, int r, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[r][mid] == target) {
                return new int[]{r, mid}; // Fixed: changed 'c' to 'mid'
            }
            if (matrix[r][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchOnSortedMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length; // be careful: matrix maybe empty
        
        // Added null check and empty matrix check
        if (matrix == null || r == 0) {
            return new int[]{-1, -1};
        }
        
        if (r == 1) {
            return binarySearch(matrix, 0, 0, c - 1, target);
        }
        
        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;
        
        // Check if cMid is valid
        if (cMid < 0 || cMid >= c) {
            return new int[]{-1, -1};
        }

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Boundary checks before array access
        if (rStart < r && cMid < c) {
            if (matrix[rStart][cMid] == target) {
                return new int[]{rStart, cMid};
            }
        }
        
        if (rStart + 1 < r && cMid < c) {
            if (matrix[rStart + 1][cMid] == target) {
                return new int[]{rStart + 1, cMid};
            }
        }

        // Check bounds before searching in different quadrants
        if (cMid > 0 && matrix[rStart][cMid - 1] >= target) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (cMid + 1 < c && matrix[rStart][cMid + 1] >= target) {
            return binarySearch(matrix, rStart, cMid + 1, c - 1, target);
        }
        if (rStart + 1 < r && cMid > 0 && matrix[rStart + 1][cMid - 1] >= target) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        if (rStart + 1 < r && cMid + 1 < c && matrix[rStart + 1][cMid + 1] >= target) {
            return binarySearch(matrix, rStart + 1, cMid + 1, c - 1, target);
        }

        return new int[]{-1, -1};
    }
}


