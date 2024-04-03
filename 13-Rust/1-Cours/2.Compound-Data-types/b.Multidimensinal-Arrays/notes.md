# n dimensional array
    - A three-dimensional array is a collection of two-dimensional arrays.
    - U need to know 3 index to access an element : 
            a - the index of the two-dimensional array
            b - the index of the row in the two-dimensional array
            c - the index of the column in the two-dimensional array 
    - Warning : 
        - this is a mistake : 
            ```rust
            let a = [[1,2,3] , [4,5,6,7]];
            ```
        - Because the first array has 3 elements and the second has 4 elements , so the compiler will give you an error.