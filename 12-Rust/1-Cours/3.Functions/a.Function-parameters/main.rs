fn main(){
    say_hy();
    print_a_number(5);
    let x = 1;
    let y = 3;
    sum(x,y);
}


fn say_hy(){
    println!("Hy <3");
}

fn print_a_number(name: i32){
    println!("The number is: {}", name);
}

fn sum(a:u8 , b: u8){
    let sum:u8 = a +b;
    println!("the sum : {}" , sum);
}