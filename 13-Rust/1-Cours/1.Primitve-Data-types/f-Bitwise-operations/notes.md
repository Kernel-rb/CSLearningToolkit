# Bitwise operations
    - Bitwise operations are operations that directly manipulate bits.
    - They are used in low-level programming, such as in device drivers and operating systems.
    - 
## Bitwise Not

        | A | Not A |
        |---|-------|
        | 0 | 1     |
        | 1 | 0     |

## Bitwise And 
    
            | A | B | A & B |
            |---|---|-------|
            | 0 | 0 | 0     |
            | 0 | 1 | 0     |
            | 1 | 0 | 0     |
            | 1 | 1 | 1     |
        - A common use of the bitwsise And is to clear value of a specific bit in a number.

## Bitwise Or

            |A|B|A or B|
            |-|-|------|
            |0|0|0     |
            |0|1|1     |
            |1|0|1     |
            |1|1|1     |

## Bitwise Xor
   - Xor is a short form of exclusive or.thats mean it will return true if and only if one of the operands is true.
   
            |A|B|A xor B|
            |-|-|-------|
            |0|0|0      |
            |0|1|1      |
            |1|0|1      |
            |1|1|0      |


## Bit Shift operators
  - Shift bit pattern left or right by specified number of bits.
    - Left shift operator: <<
    - Right shift operator: >>
    for example:
    ```rust
    let a = 0b01u8;
    let b = a << 1; // b = 0b10
    let c = a >> 1; // c = 0b00
    ```
    