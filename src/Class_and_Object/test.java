/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_and_Object;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Java","Joshua Bloch", "Addison-Wesley",2020,15);
        b1.displayInfo();
        b1.setYear(2015);
        b1.setCopy(10);
        b1.displayInfo();
        
        System.out.println("Author Name : "+ b1.getAuthor());
    }
}
