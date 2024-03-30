console.log("the first msg");

process.on("beforeExit", (code) => {
    console.log("Process beforeExit event with code: ", code);
});

process.on("exit", (code) => {
    setTimeout(() => { console.log("This will not run"); }, 0);
    console.log("Process exit event with code: ", code);
});

console.log("the last msg");

//process.exit(0); // This will not allow the setTimeout to run