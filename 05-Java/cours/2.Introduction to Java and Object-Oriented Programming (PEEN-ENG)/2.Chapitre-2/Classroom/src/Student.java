public class Student {
    String name;
    int ID;
    public Student(String name , int ID){
        this.name = name;
        this.ID = ID;
    }

    public String toString(){
        return "The Student name : " + this.name + "\n" + "The Student ID : " + this.ID;
    }
}
