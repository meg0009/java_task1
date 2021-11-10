package com.chivapchichi.database;

import java.util.Arrays;

public class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsBuilder = new StringBuilder();
        for (Author author : this.authors) {
            authorsBuilder.append(author.toString()).append(", ");
        }
        String authors = authorsBuilder.toString();
        authors = authors.length() != 0 ? authors.substring(0, authors.length() - 2) : authors.toString();

        return "Book[" +
                "name=" + name +
                ", authors={" + authors +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames() {
        StringBuilder resBuilder = new StringBuilder();
        for (Author author : authors) {
            resBuilder.append(author.getName()).append(", ");
        }
        String res = resBuilder.toString();
        return res.length() != 0 ? res.substring(0, res.length() - 2) : res.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return name.equals(book.name) &&
                Arrays.equals(authors, book.authors) &&
                price == book.price &&
                qty == book.qty;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * name.hashCode();
        result += 31 * Arrays.hashCode(authors);
        result += 31 * price;
        result += 31 * qty;
        return result;
    }
}
