public class Person {
    String name;
    int age;
    double xp;

    public Person(String name , int age , double xp ){
        this.name = name;
        this.age = age;
        this.xp = xp;
    }

    public boolean equal(Object ppp){
        Person agentK = (Person) ppp;
        return this.name.equals(agentK.name) && this.age == agentK.age && Double.compare(this.xp , agentK.xp) == 0 ;
    }
}

