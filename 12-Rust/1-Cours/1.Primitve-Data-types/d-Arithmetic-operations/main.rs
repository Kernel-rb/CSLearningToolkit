fn main(){
    add();
    sub();
    mul();
    div();
    modulo();
    floating_point();
    as_value();
}

// ----- Arithmetic operations -----
fn add(){
    let a:i8 = 5;
    let b:i8 = -3;
    let c:i8 = a + b ;
    println!("{} + {} = {}" ,a  , b ,c );
}
fn sub(){
    let a:i8 = 5;
    let b:i8 = -3;
    let c:i8 = a - b ;
    println!("{} - {} = {}" ,a  , b ,c );
}

fn mul(){
    let a:i8 = 5;
    let b:i8 = -3;
    let c:i8 = a * b ;
    println!("{} * {} = {}" ,a  , b ,c );
}

fn div(){
    let a:i8 = 5;
    let b:i8 = -3;
    let c:i8 = a / b ;
    println!("{} / {} = {}" ,a  , b ,c );
}


fn modulo(){
    let a:i8 = 5;
    let b:i8 = -3;
    let c:i8 = a % b ;
    println!("{} % {} = {}" ,a  , b ,c );
}

fn floating_point(){
    let a:f32 = 5.0;
    let b:f32 = -3.0;
    let c:f32 = a / b ;
    println!("{} / {} = {}" ,a  , b ,c );
}

fn as_value(){
    let a = 10 ;
    let b = 3.0; 
    let c =  a as f32 / b ;
    println!("{} / {} = {}" ,a  , b ,c );
}