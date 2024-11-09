function pgn(arr) {
    if (arr.lenght === 0) {
        return undefined 
    }
    let plusgra = arr[0]

    for (let i = 1; i < arr.length ; i++){
        if (plusgra < arr[i]) {
            plusgra = arr[i]
        }
    }
    return plusgra
}

let az = [0,2,7,3]

console.log(pgn(az));