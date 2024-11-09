const id = {
    name: "Kernel",
    greet : function() {
        console.log(`Hello ${this.name}`);
    },
}
id.greet();