fn main() {
    let person: (&str, u32, &str, u32, &str, u32) = ("Alex", 21, "Abe", 22, "Anna", 23);
    println!("{x} : {a}, {y} : {b}, {z} : {c}", x = person.0, a = person.1, y = person.2, b = person.3, z = person.4, c = person.5);
}

