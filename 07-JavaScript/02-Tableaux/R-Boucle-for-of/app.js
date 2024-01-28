const arr = [1, 2, 3, 4, 5];
for (let i = 0; i < arr.length; i++) {
    console.log(i);
    console.log(arr[i]);
}

const names = ["kernel", "kernel2", "kernel3"];
for (let name of names) {
    console.log(names.indexOf(name), name);
}