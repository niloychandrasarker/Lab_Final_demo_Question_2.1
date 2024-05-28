/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        shape circle = new circle(10);
        System.out.println(" Circle area = " + circle.calculateArea());
        
        shape rac = new ractangular(10,20);
        System.out.println(" ractangular area = " + rac.calculateArea());
        
    }
}
