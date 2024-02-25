function calculate(num1, oper, num2) {
    if (oper === '+') {
        return num1 + num2
    } else if (oper === '-') { 
        return num1  - num2 
    } else if (oper === "*") {
        return num1 * num2 
    } else if (oper === "/") {
        return num1 / num2
    }
}

console.log(calculate(6, "+" , 4))
console.log(calculate(4, "-" , 6))
