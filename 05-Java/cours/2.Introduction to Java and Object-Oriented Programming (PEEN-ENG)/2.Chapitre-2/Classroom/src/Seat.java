public class Seat {
    int row;
    int column;
    Student StudentInSeat;

    public Seat(int row  , int column){
        this.row = row;
        this.column = column;
    }

    public void putStudentInSeat(Student student){
       this.StudentInSeat = student;
    }

    public String toString(){
        return  "nb of row : " +  this.row + "\n"+ "nb of column : " +  this.column + "\n" + "nb of  Student in Seat : " +  this.StudentInSeat + "\n";
    }
}
