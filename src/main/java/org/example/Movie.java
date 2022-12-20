package org.example;

public class Movie {

    private String title;
    private int price;

    private String genre;


    public Movie() {
    }

    public Movie(String title, int price, String genre) {
        this.title = title;
        this.price = price;
        this.genre = genre;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
