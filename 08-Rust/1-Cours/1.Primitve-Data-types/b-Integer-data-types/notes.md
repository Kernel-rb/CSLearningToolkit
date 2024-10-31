# Data types
    - Defines what the programmer intends data means to the computer
    - Defines how data should be stored and interepreted by the computer
    - Defines which operations can be performed on the data

# Rust Is a Statically Typed Language
    - All variable data types must be known at compile time
    - Similar to C, C++, Java and Go

# Rust Scalar Data types
    - Integers
    - Floating-point numbers
    - Booleans
    - Characters

# Integer Data types
    - Characterized by number of bits they take up in memory
    - Unsigned -> Only positive numbers
    - Signed -> Positive and negative numbers

### 8 bits Integers
    - 2^8 = 256 possible values
    - u8 -> [0, 255] , for example, 0, 1, 2, 3, ..., 255
    - i8 -> [-128, 127] , for example, -128, -127, -126, ..., 127
![alt text](./image.png)

### 16 bits Integers
    - 2^16 = 65536 possible values
    - u16 -> [0, 65535]
    - i16 -> [-32768, 32767]
![alt text](./image-1.png)

### 32 bits Integers
    - 2^32 = 4294967296 possible values
    - u32 -> [0, 4294967295]
    - i32 -> [-2147483648, 2147483647]
![alt text](./image-2.png)

## Rust Integer Data types 
    |Length|Signed|Unsigned|
    |------|------|--------|
    |8-bit | i8   | u8     |
    |16-bit| i16  | u16    |
    |32-bit| i32  | u32    |
    |64-bit| i64  | u64    |
    |128-bit|i128 | u128   |

- By default Rust uses `i32` for integers