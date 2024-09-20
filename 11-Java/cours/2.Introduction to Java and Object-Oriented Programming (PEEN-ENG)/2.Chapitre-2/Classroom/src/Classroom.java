import java.util.ArrayList;
public class Classroom {

    String buildingName;
    String  roomName;
    ArrayList<Student> Students;
    Seat[][] seats;


    public Classroom(String buildingName , String roomName , int rows , int columns){
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.seats = new  Seat[rows][columns];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                seats[i][j]  = new Seat(i, j);
            }
        }
        this.Students = new ArrayList<Student>();
    }

    public void addAStudent(Student student){
        this.Students.add(student);
    }

    public void assignStudentToSeat(Student student){
        int rows = this.seats.length;
        int columns = this.seats[0].length;
        for (Seat[] seat : this.seats) {
            for (int j = 0; j < columns; j++) {
                if (seat[j].StudentInSeat == null) {
                    seat[j].putStudentInSeat(student);
                    return;
                }
            }
        }
    }


    public void printAllStudent(){
        System.out.println("Present Student in the class : ");
        for(Student student : this.Students){
            System.out.println("-" + student);
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder("\n");
        int rows = this.seats.length;
        int columns = this.seats[0].length;
        for (Seat[] seat : this.seats) {
            for (int j = 0; j < columns; j++) {
                s.append(seat[j]).append("\t");
            }
            s.append("\n");
        }
        return s.toString();

    }
    public static void main(String[] args){
        Classroom q101  = new Classroom("B01" , "104" , 10 , 5);
        Student kernel  = new Student("Kernel-rb" , 1458);
        Student saif = new Student("Saif" , 1489);

        q101.addAStudent(kernel);
        q101.addAStudent(saif);

        q101.assignStudentToSeat(kernel);
        q101.assignStudentToSeat(saif);

        //print all student

        q101.printAllStudent();
        System.out.println(q101);
    }
}
