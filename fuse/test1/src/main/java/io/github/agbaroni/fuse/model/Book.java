package io.github.agbaroni.fuse.model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    private String ISBN;

    private String title;
    @OneToOne
    @JoinColumn(name = "author_isbn")
    private Author person;
    private BigDecimal price;


    public Book(String ISBN, String title, Author author, BigDecimal price) {
        this.ISBN = ISBN;
        this.title = title;
        this.person = author;
        this.price = price;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getPerson() {
        return person;
    }

    public void setPerson(Author author) {
        this.person = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN) && Objects.equals(title, book.title) && Objects.equals(person, book.person) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, person, price);
    }


    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", person=" + person +
                ", price=" + price +
                '}';
    }
}


