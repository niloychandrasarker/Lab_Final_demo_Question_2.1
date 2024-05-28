/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_and_Object;

/**
 *
 * @author DELL
 */
public class Book {

    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int numberOfCopies;

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Book(String title, String author, String publisher, int yearPublished, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        setYear(yearPublished);
        setCopy(numberOfCopies);
    }

    public void setYear(int yearPublished) {
        if (yearPublished > 0) {
            this.yearPublished = yearPublished;
        } else {
            System.out.println("invalid yead published,please enter non-negative value");
        }
    }

    public void setCopy(int numberOfCopies) {
        if (numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        } else {
            System.out.println("invalid number Of Copiesplease enter non-negative value");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Number of Copies: " + numberOfCopies);
    }
}
