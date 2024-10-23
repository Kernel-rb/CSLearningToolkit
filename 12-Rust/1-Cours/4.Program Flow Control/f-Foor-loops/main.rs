fn main(){
    for_loop();
    for_range();
}

fn for_loop(){
    println!("for loop");
    let letter = ['k', 'e', 'r' , 'n' , 'e' , 'l'];
    for (index , &item)  in letter.iter().enumerate() {
        println!("Index: {} , Item: {}", index, item);
        if item == 'n'{
            break;
        }
    }
}

fn for_range(){
    println!("for range loop");
    for i in 0..5 {
        println!("Index: {}", i);
    }
}