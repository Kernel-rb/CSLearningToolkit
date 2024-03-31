// Simple array
fn simple_array() 
{
    Let simple_array :[ i32 , 5 ] = [ 1 , 2 , 3 , 4 , 5 ];
    println!("{:?}", simple_array);
}
// len of an array
fn len_arr() 
{
    Let simple_array :[ i32 , 5 ] = [ 1 , 2 , 3 , 4 , 5 ];
    println!("len of array is {}", simple_array.len());  
}
// slice an array
fn slice_array() 
{
    let array_1 :[ i32 , 5 ] = [ 1 , 2 , 3 , 4 , 5 ];
    let slice_array = &array_1[1..3];
    println!("slice array is {:?}", slice_array);
    // slice array is [2, 3]
}
