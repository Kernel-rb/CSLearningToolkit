fn main(){
    not();
    and();
    or();
    xor();
    shift();
}

fn not(){
    let mut bits = 0b0000_1010u8;
    bits = !bits;
    println!("{:08b}", bits);
}

fn and(){
    let a = 0b0000_1010u8;
    let b = 0b0000_1100u8;
    let c = a & b;
    println!("{:08b}", c);
}

fn or(){
    let a = 0b0000_1010u8;
    let b = 0b0000_1100u8;
    let c = a | b;
    println!("{:08b}", c);
}

fn xor(){
    let a = 0b0000_1010u8;
    let b = 0b0000_1100u8;
    let c = a ^ b;
    println!("{:08b}", c);
}

fn shift(){
    let a = 0b0000_1010u8;
    let b = a << 1;
    println!("{:08b}", b);
    let c = a >> 1;
    println!("{:08b}", c);
}