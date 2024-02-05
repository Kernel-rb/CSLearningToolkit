function dateValidator(dd ,mm, yyyy){
    if (yyyy < 0  | yyyy > 2024){
        return false
    }
    if (mm < 0 | mm > 12 ){
        return false
    }

    const dd_mm = new Date(yyyy , mm ,1).getDate()
    if (dd <= 0 | dd> dd_mm  ){
        return false
    }



    return true
}

res =dateValidator(0 ,  20 , 1000)
res2 = dateValidator(1 , 12 , 2012)
console.log(res , res2)