const EventEmitter = require('events');
const myEmitter = new EventEmitter();

const handleError = function (err) {
    console.log(`Error: ${err}`);
}

myEmitter.on('error', handleError);
myEmitter.emit('error', 6);
