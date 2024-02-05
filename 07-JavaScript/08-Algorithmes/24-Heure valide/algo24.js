function heurValidator(h , min , sec){
    if (h <  0 | h > 23){
        return false
    }
    if (min < 0 | min > 59){
        return false
    }
    if (sec <0 | sec > 59){
        return false
    }
    

    return true
}

res = heurValidator(0, 500 , 6);
console.log(res)