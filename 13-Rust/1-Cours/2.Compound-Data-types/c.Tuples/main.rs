fn main(){
    let mut stuffs:(u8 , f32 , char ) = (10 , 3.14 , 'x');
    stuffs.0 += 3;
    let first_item = stuffs.0;
    println!("the first item of the tuple is {}" , first_item);

    let (a,b ,c) =  stuffs;
    println!("the value of a : {}\n,the value of b : {}\n,the value of c : {}\n" , a , b ,c );
}