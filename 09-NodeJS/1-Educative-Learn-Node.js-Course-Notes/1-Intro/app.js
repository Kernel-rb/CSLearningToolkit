function lateFunc()
//  function that will be executed after 1 second
{
    console.log("this was done asynchronously")
    // log that will be printed after 1 second
}

console.log("this the first log");

setTimeout(lateFunc, 1000);
// function that will be executed after 1 second


console.log("this the last log");