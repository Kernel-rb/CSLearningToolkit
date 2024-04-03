fn main(){
    while_loop();
    while_array();
}

fn while_loop(){
    let mut n = 0;
    while n < 5 {
        println!("n is {}", n);
        n += 1;
    }
    println!("loop ended");
}

fn while_array(){
    let mut count= 0;
    let letter = ['a', 'b', 'c'];
    println!("looping through array");
    while count < letter.len(){
        println!("letter is {}", letter[count]);
        count += 1;
    }
    println!("loop ended");
}