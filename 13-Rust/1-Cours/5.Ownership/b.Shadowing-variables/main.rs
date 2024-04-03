fn main(){
    shadowing();
}

fn shadowing(){
    let planet = "Earth";
    println!("Hello, {}!", planet);

    let planet = "Mars";
    println!("Hello, {}!", planet);

    let planet = 4;
    println!("Hello, {}!", planet);
}