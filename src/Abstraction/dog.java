/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author DELL
 */
public class dog extends animal implements dog_play {
    @Override
    void sound(){
        System.out.println("dog Barks");
    }
    @Override
    public void  play(){
        System.out.println("dog plays");
    }
}
