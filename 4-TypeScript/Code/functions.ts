function AddOne(num: number): number {
    return num + 1
}
const result = AddOne(1)
console.log(result)

// Arrow functon annotation
// what is an arrow function?
// Arrow functions are a new way to write anonymous function expressions.
const double = (x: number, y: number): number => x * y;
const doubleResult = double(2, 3)
console.log(doubleResult)