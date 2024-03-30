const square = require('./square.js');
const shape = require('./shape.js');

console.log(`Area of square is ${square.area(5)}`);
console.log(`Perimeter of square is ${square.perimeter(5)}`);

const MyShape = new shape('hexagone', 6);
MyShape.info();