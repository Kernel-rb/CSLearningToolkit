const ID : {
    firstName: string;
    lastName: string;
    age: number;
    student :boolean
    
} = {
    firstName: 'Saif',
    lastName: "Matab",
    age: 19,
    student : true,
};


const Hobby: {
    Football : boolean, 
    Basketball: boolean,
    Dev: boolean
    } = {
    Football: false,
    Basketball : false,
    Dev:  true,

};

console.log(`My Name is ${ID.firstName + ID.lastName} ,${ID.age} years old and i love Codding `)
console.log(` I love playing BasketBall ? ${Hobby.Basketball}`)