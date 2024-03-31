const repl = require('repl');
const msg = "Welcome to the Node.js REPL!\n";

repl.start("-------->").context.textMessage = msg;