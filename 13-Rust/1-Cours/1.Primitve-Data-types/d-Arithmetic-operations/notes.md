# Casting 
    - Converting a variable from one data type to another.
    - Rust uses `as` keyword for casting.
    - 3 as f64 -> 3.0
    - 3.9 as i32 -> 3
    - 300 as u8 -> 44  , cuz  **300 % 256 = 44**
    - -300 as u32 -> 4294966996 , cuz **-300 + 2^32 = 4294966996**

## The order of operations
    - Rust follows the same order of operations as mathematics.
    - Parentheses
    - Exponents
    - Multiplication and division
    - Addition and subtraction
    - Left to right