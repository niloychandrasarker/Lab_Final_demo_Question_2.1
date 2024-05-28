/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arithmatic;

/**
 *
 * @author DELL
 */
public class main {
    
    public static int sum(int a,int b){
        return a+b;
    }
    public static int area(int length,int width){
        return length * width;
    }
    public static int perimeter(int length, int width) {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        
        System.out.println("sum = "+ sum(10,20));
        System.out.println("area = "+ area(20,10));
        System.out.println("perimeter = "+ perimeter(20,10));
    }
}
