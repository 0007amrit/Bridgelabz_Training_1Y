package q5.library.books;

public class Book {

    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void display(){
        System.out.println("Book: " + title);
    }
}