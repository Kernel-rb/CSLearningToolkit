# Floating-Point Data Types
    - Represnt numbers with decimal points using the IEEE 754 standard
    - Rust support two floating-point data types
        - `f32` -> Single precision
        - `f64` -> Double precision
    - Value stored as fractional and exponential components
    - Max `f64` value: 1.7976931348623157 * 10^308

## Representing Pi
    - `f32` -> 3.1415927
    - `f64` -> 3.141592653589793

## Guidelines
    - If you need to store fractional value use the default `f64`
    - If you need to store a large number of floating-point values use `f32` to save memory