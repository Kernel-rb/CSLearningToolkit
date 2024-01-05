fn tuple() 
{
    let person_data = ("Kernel", 19 , "etudiant");
    let person_data2 : (&str, i32, &str) = ("Kernel", 19 , "etudiant");
    
    println!("{} a {} ans et est {}", person_data.0, person_data.1, person_data.2); // output : Kernel a 19 ans et est etudiant
    println!("{:?}", person_data); // output : ("Kernel", 19, "etudiant")

}

fn mutable_tupple() 
{
    Let mut person_data = ("Kernel", 19 , "etudiant");// mutavle 
    person_data.1 = 20; // new age
    println!("{:?}", person_data); // output : ("Kernel", 20, "etudiant"
}