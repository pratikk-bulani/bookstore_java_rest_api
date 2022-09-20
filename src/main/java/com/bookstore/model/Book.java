package com.bookstore.model;

import java.util.List;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
class Review {
    private String name, body;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}

@Document(collection = "books")
public class Book {
    @Id
    private String id;

    @NotBlank
    @Size(max=100)
    @Indexed(unique = true)
    private String title;

    @NotBlank
    @Size(max=100)
    private String author;

    @NotBlank
    private int pages = -1;

    @NotBlank
    private double rating = -1;
    
    private List<String> genres;

    private List<Review> reviews;

    public Book() {}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getGenres() {
        return genres;
    }
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Review> getReviews() {
        return reviews;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", pages=" + pages + ", rating=" + rating +
            "]";
    }
}
