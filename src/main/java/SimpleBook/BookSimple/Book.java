package SimpleBook.BookSimple;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int price;
    private String published_Date;

    public Book(){};

    public Book(int id,String title,String author,int price,String publishedDate){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        this.published_Date=publishedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublished_Date() {
        return published_Date;
    }

    public void setPublished_Date(String published_Date) {
        this.published_Date = published_Date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishedDate='" + published_Date + '\'' +
                '}';
    }
}
