module.exports = class Shape 
{
    constructor(name , sides)
    {
        this.name = name;
        this.sides = sides;
    }

    info()
    {
        console.log(`the name of the sahpe is ${this.name}`);
        console.log(`it has ${this.sides} sides`);
    }
}