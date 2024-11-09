let userInfo = {
    name: "Kernel",
    age: 19,
    isStudent: true,
}

console.log(userInfo); // { name: 'Kernel', age: 19, isStudent: true }
console.log(userInfo.name); // Kernel
console.log(userInfo.age); // 19

userInfo.name = "Saif"; 
console.log(userInfo.name); // Saif

userInfo.nickname = "Kernel";
console.log(userInfo);
console.log(userInfo.nickname); // Kernel


delete userInfo.isStudent;
console.log(userInfo); // { name: 'Saif', age: 19, nickname: 'Kernel' }

/////////////////////////////////////////

let rust = {
    name: "Rust",
    year: 2010,
    paradigm: "functional",
    plus: ["safe", "concurrent", "fast"],
    founder: {
        company: "Mozilla",
        founder: "Graydon Hoare"
    },
    func : () => console.log("Rust >>>>>>>> C++")
}

console.log(rust); // { name: 'Rust', year: 2010, paradigm: 'functional', plus: [ 'safe', 'concurrent', 'fast' ], founder: { company: 'Mozilla', founder: 'Graydon Hoare' }, func: [Function: func] }
console.log(rust.name); // Rust

rust.func(); // Rust >>>>>>>> C++


const tab = [1, 2, 3, 4, 5];
console.log(tab); // [ 1, 2, 3, 4, 5 ]
console.log(typeof tab); // object 
// les tableaux sont des objets avec des méthodes prédéfinies