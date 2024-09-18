package models;

public class Book {

    String name;
    int price;
    String author;
    boolean is_discounted;
    Genre genre;

    public Book(String name, int price, String author, boolean is_discounted, Genre genre) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.is_discounted = is_discounted;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIs_discounted() {
        return is_discounted;
    }

    public void setIs_discounted(boolean is_discounted) {
        this.is_discounted = is_discounted;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
