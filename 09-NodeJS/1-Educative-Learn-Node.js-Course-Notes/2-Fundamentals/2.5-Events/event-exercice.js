const EventEmitter = require("events");
const myEmitter = new EventEmitter();

myOrder = function (food) {
    console.log(`the food ${food}`)
}

myEmitter.on("order", myOrder);

doorbell = function () {
    console.log("RING RING!");
}
myEmitter.on("doorbell", doorbell);


payment = function (food) {
    console.log(`Enjoy your ${food}`);
}
myEmitter.on('payment', payment);