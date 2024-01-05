fn array()
{
    let arr = [0 ,2 , 4, 6, 8, 10];
    println!("{x},{y},{z},{a},{b},{c}", x=arr[0], y=arr[1], z=arr[2], a=arr[3], b=arr[4], c=arr[5]);
}


fn pair()
{
    let arr = [0 , 1 ,2,3,4,5,6,7,8,9,10];
    
    for i in 0..arr.len()
    {
        if arr[i] % 2 == 0
        {
            println!("{} is pair", arr[i]);
        }
    }
}