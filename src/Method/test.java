/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 int : "+ c.add(10, 20));
        System.out.println("Sum of 2 int : "+ c.add(10, 20, 30));
        c.display();
    }
}