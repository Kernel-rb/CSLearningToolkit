fn max() {
    let numbers = [1 , 9 ,-2 ,0,23,20,-7,13,37,20,56,-18,20,3];
    let mut max:i32 = 0;
    for i in 0..numbers.len(){
        if numbers[i] > max{
            max = numbers[i]
        }else{
            max;
        }
    }
    println!("the max of the array  is {} " , max);
}

fn min() {
    let numbers = [1 , 9 ,-2 ,0,23,20,-7,13,37,20,56,-18,20,3];
    let mut min:i32 = 0;
    for i in 0..numbers.len(){
        if numbers[i] < min{
            min = numbers[i]
        }else{
            min;
        }
    }
    println!("the min value of the array is {} " , min);
}

fn mean(){
    let mut sum_of_array_element:i32 = 0;
    let numbers = [1 , 9 ,-2 ,0,23,20,-7,13,37,20,56,-18,20,3];
    for i in 0..numbers.len(){
        sum_of_array_element += numbers[i];
    }
    
    let mean:f64 = (sum_of_array_element as f64) / (numbers.len() as f64) ;
    
    println!("the mean is {}" , mean );
}