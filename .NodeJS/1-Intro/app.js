function lateFunc()
{
    console.log("this was done asynchronously")
}

setTimeout(lateFunc, 1000);
console.log("this the first log");


console.log("this the last log");