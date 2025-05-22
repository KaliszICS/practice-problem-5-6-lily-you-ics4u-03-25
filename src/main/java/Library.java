import java.util.ArrayList;

public class Library{
    Book book;
    ArrayList<Book> books = new ArrayList<Book>();
    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String ISBN){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getISBN().equals(ISBN)){
                books.remove(i);
                return;
            }
        }
    }

    public Book[] searchBook(String title){
        ArrayList<Book> returnBooks = new ArrayList<Book>();
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                returnBooks.add(book);
            }
        }
        Book[] bookArr = returnBooks.toArray(new Book[returnBooks.size()]);
        return bookArr;
    }

    public Book[] displayBooks(){
        Book[] bookArr = this.books.toArray(new Book[this.books.size()]);
        return bookArr;
    }

}