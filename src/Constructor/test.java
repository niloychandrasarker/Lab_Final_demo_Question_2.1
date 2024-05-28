/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author DELL
 */
public class test {

    public static void main(String[] args) {
        Ractengle r1 = new Ractengle();
        System.out.println("Rec-1 : No argument constructor call");
        System.out.println("heoght : " + r1.getHeight());
        System.out.println("width : " + r1.getWidth());
        System.out.println("area : " + r1.area());

        r1.setHeight(10);
        r1.setWidth(5);
        System.out.println("\nRec-1 : after setting height and width");
        System.out.println("heoght : " + r1.getHeight());
        System.out.println("width : " + r1.getWidth());
        System.out.println("area : " + r1.area());
        
        Ractengle r2 = new Ractengle(20,10);
        System.out.println("\nRec-2 : two argument constructor call");
        System.out.println("heoght : " + r2.getHeight());
        System.out.println("width : " + r2.getWidth());
        System.out.println("area : " + r2.area());
        
        r2.setHeight(30);
        r2.setWidth(20);
        System.out.println("\nRec-2 : after setting height and width");
        System.out.println("heoght : " + r2.getHeight());
        System.out.println("width : " + r2.getWidth());
        System.out.println("area : " + r2.area());
    }
}
