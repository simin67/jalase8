package Session8;

public class Book {
   private String title;
    private String author;
    public  void showInfo(){
        System.out.println(title);
        System.out.println(author);
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title =title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
