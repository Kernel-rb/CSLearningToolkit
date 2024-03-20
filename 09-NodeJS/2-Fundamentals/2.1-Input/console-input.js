const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
}); 

let question = "What is your name? \n";

rl.question(question, (answer) => {
    console.log(`Hello ${answer}`);
    rl.close();
});