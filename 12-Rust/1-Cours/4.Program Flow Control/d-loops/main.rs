fn main(){
    basic_loop();

}


fn basic_loop(){
    let mut count:i8 = 0;
    let result = loop{
        count += 1;
        println!("count is {}", count);
        if count == 10 {
            break count * 2;
        }
    };
    println!("loop ended");
    println!("result is {}", result);
}