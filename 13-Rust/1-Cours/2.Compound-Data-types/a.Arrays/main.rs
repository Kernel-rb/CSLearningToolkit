fn main(){
    let mut letters = ["a" , "b" , "c"];
    letters[0] = "d";
    let first_letter = letters[0];
    println!("The first letter is: {}", first_letter);

    let numbers:[i32 ;5];
    numbers = [0;5]; // [0,0,0,0,0]
    let index =  numbers.len() - 1 ;
    println!("The first number is: {}", numbers[index]);
}