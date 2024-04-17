import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private String nickname;
    private LocalDate birthday;
    private ArrayList<Book>books = new ArrayList<Book>();

    User(String name, String nickname , String birthday){
        this.name = name;
        this.nickname = nickname;
        this.birthday = LocalDate.parse(birthday);
    }

    public String getName(){
        return this.name;
    }
    public String getnickname(){
        return this.nickname;
    }
    public String getbirthday(){
        return this.birthday.toString();
    }

    public String borrowedBooks(){
        return this.books.toString();
    }

    
    public void borrow(Book book){
        this.books.add(book);
    }

    
    public int age() {  
        int age = Period.between(this.birthday, LocalDate.now()).getYears();
        return age;
      };
}