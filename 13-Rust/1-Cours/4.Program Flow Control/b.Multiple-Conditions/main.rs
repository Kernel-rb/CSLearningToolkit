fn main(){
    let x:i8 = 3;
    let y:i8 = 5;

    // method 1
    if x> y {
        println!("x is greater than y");
    }else{
        if x < y {
            println!("x is less than y");
        }else{
            println!("x is equal to y");
        }
    }

    // method 2
    if x> y {
        println!("x is greater than y");
    }else if x < y {
        println!("x is less than y");
    }else{
        println!("x is equal to y");
    }
}