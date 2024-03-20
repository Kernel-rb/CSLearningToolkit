const buf1 = Buffer.alloc(10);
// alloc(10) means that the buffer can contain 10 bytes and all the bytes are initialized to 0
console.log(buf1);

const buf2 = Buffer.alloc(10, 1);
// alloc(10, 1) means that the buffer can contain 10 bytes and all the bytes are initialized to 1
console.log(buf2);

const buf3 = Buffer.allocUnsafe(10);
// alloc unsafe is faster than alloc but it can contain data from other programs
// allocUnsafe(10) mean that the buffer can contain 10 bytes but it is not initialized
console.log(buf3);

buf3.fill(0);
// fill(0) means that all the bytes in the buffer are initialized to 0
console.log(buf3)

buf2.write("hello");
// write("hello") means that the buffer is filled with the string "hello"
console.log(buf2);

const buf4 = Buffer.from([1, 2, 3]);
// from([1, 2, 3]) means that the buffer is filled with the array [1, 2, 3]
console.log(buf4);

const buf5 = Buffer.from("hello", "utf8");
// from("hello", "utf8") means that the buffer is filled with the string "hello" and the encoding is utf8
console.log(buf5);

console.log(buf5.toString());
// toString() means that the buffer is converted to a string