fn main(){
    two_dimensional_array();
    three_dimensional_array();
}

fn two_dimensional_array(){
    let parking_lot = [ [ 1 , 2 , 3 ] , 
                        [ 4,  5 , 6 ]];
    let second_number_of_the_first_array:i8 = parking_lot[0][1];
    
    println!("the second number of the first row is: {}", second_number_of_the_first_array);
}


fn three_dimensional_array(){
    let parking_lot = [ [ [ 1 , 2 , 3 ] , 
                          [ 4,  5 , 6 ]],
                        [ [ 7 , 8 , 9 ] , 
                          [ 10, 11 , 12 ]]];
    let second_number_of_the_first_array:i8 = parking_lot[0][0][1];
    println!("the second number of the first row is: {}", second_number_of_the_first_array);
}

