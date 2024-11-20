package com.example.secondtask;

public class Book {
    private String title;
    private String author;
    private String description;
    private int imageResource;

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
