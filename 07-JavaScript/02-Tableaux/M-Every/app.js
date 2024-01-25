let nb = [2,4,6,8,10]

let even = nb.every(function(number){
    return number % 2 === 0
})

console.log(even);