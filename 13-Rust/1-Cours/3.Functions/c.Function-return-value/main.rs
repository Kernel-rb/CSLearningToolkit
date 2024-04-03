fn main(){
    let result:i32 = square(2);
    println!("The square of 2 is: {}", result);
    let x;
    let y;
    (x, y) = return_two_values(3);
    println!("the square of {} is : {}", x , y);
}


fn square(x:i32) -> i32{
    return x*x;
}

fn return_two_values(x:i32) -> (i32, i32){
    return (x, x*x);
}