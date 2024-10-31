// Goal :
//          - Computer the arithemtic average of three numbers

fn main(){
    let a = 13;
    let b = 2.3;
    let c:f64 = 120.0;
    /* Code goes here */
    let average:f64 = (a as f64 + b as f64 + c) / 3 as f64 ; 
    assert_eq!(average, 45.1);
    println!("Test passed !");
}