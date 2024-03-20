const EventEmitter = require('events');

const myEmitter = new EventEmitter();

biipSound = function () {
    console.log("Biiips");
}

myEmitter.on('biip sound', biipSound);
// on is a method that listens for the event
// the first argument is the event name
// the second argument is the callback function that will be executed when the event is emitted

myEmitter.emit("the biiiiiiip")
// emit is a method that emits the event , emit => alert
// the argument is the event name
