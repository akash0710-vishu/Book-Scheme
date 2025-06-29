package SimpleBook.BookSimple;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class bookentity {
    @Id
    int id;
    String booktitle;
    String reviewer;
    String content;

    public bookentity(){};
    public bookentity(int id,String booktitle,String reviewer,String content){
        this.id=id;
        this.booktitle=booktitle;
        this.reviewer=reviewer;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
