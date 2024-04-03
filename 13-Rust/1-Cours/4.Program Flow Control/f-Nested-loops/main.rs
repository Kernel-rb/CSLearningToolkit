fn main(){
    nested_loop();
}

fn nested_loop(){
    let  mut matrix = [  [1, 2, 3], 
                    [4, 5, 6], 
                    [7, 8, 9]
                ];
    for i in matrix.iter(){
        for j in i.iter(){
            println!("{}\t", j);
        }
        println!();
    }
}
