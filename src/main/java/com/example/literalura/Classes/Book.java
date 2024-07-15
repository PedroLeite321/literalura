package com.example.literalura.Classes;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String language;

    @ManyToOne //Books will be mapped by author.
    @JoinColumn(name = "author_id")
    private Author author;

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book   {" +
                "id=" + id +
                ", bookTitle=" + title +  "\'" +
                ", bookLanguage=" + language + "\'" +
                "}";
    }
}
