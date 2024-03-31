# what is a tuple ? 

tuple is a collection which is ordered and unchangeable. Allows duplicate members.

## how to create a tuple  in Rust ?

syntax 1: 

```rust
   Let tuple = ("Hello" , 2 ,'c') ; 
```

syntax 2:

```rust
   Let tuple : (&str , i32 , char) = ("Hello" , 2 ,'c') ;
   // str == "Hello" , i32 == 2 , char == 'c'
```

### Mutable Tuple : 

 ```rust
      Let mut tuple = ("Hello" , 2 ,'c') ; 
      tuple.0 = "World" ; 
      // tuple == ("World" , 2 ,'c') ; 
   ```