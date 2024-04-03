fn main(){
    // the string is stored in the heap memory , so it can be modified
    let mut message = String::from("Kernel.rb");
    println!("{}", message);
    message.push_str(" is me :)");
    println!("{}", message);
}