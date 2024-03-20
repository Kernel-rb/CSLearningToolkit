const EventEmitter = require('events');
const myEmitter = new EventEmitter();

let n = 0;

incresement = function ()
{
    n++
    console.log(`the number is ${n}`)
}

myEmitter.once('incresement', incresement);
// once is a method that listens for the event only once

// did you notice the difference between on and once?

myEmitter.emit('incresement');
myEmitter.emit('incresement');
myEmitter.emit('incresement');
// this will not be executed because the event is listened only once

