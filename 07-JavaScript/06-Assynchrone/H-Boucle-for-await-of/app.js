const promesse = [
    new Promise((resolve) => setTimeout(() => resolve('1'), 1000)),
    new Promise((resolve) => setTimeout(() => resolve('2'), 2000)),
    new Promise((resolve) => setTimeout(() => resolve('3'), 3000))
];


async function read() {
    for await(const i  of promesse){
        console.log(i);
    }
}

read();