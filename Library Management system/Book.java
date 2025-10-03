public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title= title;
        this.author= author;
        this.isAvailable= true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void issueBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("book issue successfully");
        }
        else{
            System.out.println("book already issued");
        }
    }
    public void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("book returned successfully");
        }else{
            System.out.println("book was not issued");
        }
    }
    @Override
    public String toString(){
        return title + "by" + author + (isAvailable?"(Available)":"(issued)");
    }
   
    
}
