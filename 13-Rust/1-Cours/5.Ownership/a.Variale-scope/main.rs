fn main(){
    if true { // Scope starts here
        let planet = "Earth";
        println!("Hello, {}!", planet);
    } // Scope ends here
    println!("Hello, {}!", planet); // Outside the scope
}