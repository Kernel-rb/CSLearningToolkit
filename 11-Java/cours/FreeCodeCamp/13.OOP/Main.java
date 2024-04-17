public class Main {
    public static void main(String[] args) {
        
        // User 
        User user  = new User("leaonard" , "dranoel" ,"2004-07-19");

        // Book
        Book book = new Book("Bring Your Images to Life" , "leonard" , 41);
        // Audio book 
        AudioBook  audioBook =  new AudioBook("XXU9", "fais", 2201, 1780);

        // borrow func
        user.borrow(book);

       // output
       System.out.printf("%s aka %s was born %s  and he's now  %d years old \n"   , user.getName() , user.getnickname() , user.getbirthday() , user.age());
       System.out.printf("%s has wrote this book :  %s with %d pages \n"   , user.getnickname() , user.borrowedBooks() , book.getPageCount());
    }    
}
