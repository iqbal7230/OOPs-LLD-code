import java.util.ArrayList;

public class Library {
    private ArrayList<Book>books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added"+ book.getTitle());
    }
    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("No book available");
            return;
        }
        System.out.println("Library Books");
        for(int i=0;i<books.size();i++){
            System.out.println((i +1)+"."+ books.get(i));
        }
    }
    public void issueBook(int index){
        if (index >=0 && index<books.size()) {
            books.get(index).issueBook();
        }
        else{
            System.out.println("Invalid book id");
        }
    }
    public void returnBook(int index){
        if (index>=0 && index<books.size()) {
            books.get(index).returnBook();
        }
        else{
            System.out.println("Invalid book index");
        }
    }
}
