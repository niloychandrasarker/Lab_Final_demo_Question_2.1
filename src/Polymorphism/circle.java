/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author DELL
 */
public class circle extends shape {
    
    double radious;

    public circle(double radious) {
        this.radious = radious;
    }

    @Override
    double calculateArea() {
       return Math.PI * radious * radious; 
    }
    
}
