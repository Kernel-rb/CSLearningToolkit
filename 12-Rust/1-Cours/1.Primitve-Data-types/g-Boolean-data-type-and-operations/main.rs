fn main(){
    let a = true;
    let b =  false;
    println!("a : {}  and b : {}", a, b);
    println!("not a : {}", !a);
    println!("a and b : {}", a & b);
    println!("a or b : {}", a | b);
    println!("a xor b : {}", a ^ b);    

    let c =  (a ^b ) || (a & b);
    println!("c : {}", c);
    
    let d  =  (a ^b ) || panic!(); // the left side of the || operator is true, so the right side is not evaluated
    println!("d : {}", d);
}