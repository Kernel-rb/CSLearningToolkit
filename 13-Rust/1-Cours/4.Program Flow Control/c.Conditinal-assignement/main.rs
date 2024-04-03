fn main(){
    let max_x_odd:bool = true;
    let x = if max_x_odd { 1 } else { 2 }; // warning the if and else  have to return the same type
    println!("x is {}", x);
}