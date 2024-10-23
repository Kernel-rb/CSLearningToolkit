fn main(){
    let celsuis_temp = 23.0;
    let fahrenheit_temp = celsuis_to_fahrenheit(celsuis_temp);
    assert_eq!(fahrenheit_temp , 73.4);
    println!("Test passed!")
}

fn celsuis_to_fahrenheit(temp:f64) -> f64{
    return (1.8 * temp) + 32 as f64;
}