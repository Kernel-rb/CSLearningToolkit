// Map est une structure de données qui permet de stocker des données sous forme de clé/valeur

const map = new Map();
console.log(map);
map.set("key", "value");
console.log(map);



const map1 = new Map(
    [
        ["key", "value"],
        [1, "number"],
        [true, "boolean"],
        [{}, "object"],
    ]
)

map1.delete("key");


console.log(map1);
console.log(map1.get(1)); // number
console.log(map1.has(true)); // true
console.log(map1.size); // 3



for ( const [key, value] of map1) {
    console.log(key, value);
}
for (const key of map.keys()) {
    console.log(key);
}

for (const value of map.values()) {
    console.log(value);
}



const keys = Array.from(map.keys());
console.log(keys);

const values = Array.from(map.values());
console.log(values);