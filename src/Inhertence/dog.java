/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inhertence;

/**
 *
 * @author DELL
 */
public class dog extends animal{
    
    public dog(String name) {
        super(name);
    }
    
    @Override
    public void sound(){
        System.out.println(name + " says Barks");
    }
}
