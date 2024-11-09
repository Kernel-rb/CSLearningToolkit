const hy = "Hello World"

const addStr = hy.padStart(20, "add")
console.log(addStr) // addaddaddaddHello World

const endAddStr = hy.padEnd(20, "add")
console.log(endAddStr) // Hello Worldaddaddaddadd