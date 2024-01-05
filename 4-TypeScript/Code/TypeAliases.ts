type ID = {
    FirstName: string;
    LastName: string;
    Age: number;
    Student: boolean;
}; 

function Detective(id: ID) {
    console.log(`Your Name is ${id.FirstName + id.LastName} , and My age: ${id.Age}, Student (True or False) : ${id.Student}`)
}

const Me: ID = {
    FirstName: "Saif",
    LastName: "Matab",
    Age: 19,
    Student: true, 
}

let info:any = Detective(Me)

console.log(info)
