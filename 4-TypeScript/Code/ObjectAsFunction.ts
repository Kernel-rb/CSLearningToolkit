function printUser(): {
    id: number;
    fullName: string;
    age: number;
    location: string;
    subscribe: boolean;
} {
    return {
        id: 1,
        fullName: "Saif Matab",
        age: 19,
        location: "localhost:3000",
        subscribe: false,
    };
}

console.log(printUser())
