function getRandomName(): string {
    const randomNumber = Math.floor(Math.random() * 10000000000);
    return  `User${randomNumber}`;
}

function greet(name: string = "UserWithoutName"): string {
    if (name === "UserWithoutName") {
        name = getRandomName();
        return `Hello ${name}`;
    }
    else {
        return `Hello ${name}`;

    }
}

const hh = greet();
console.log(hh);

const saif = greet("Saif");
console.log(saif);