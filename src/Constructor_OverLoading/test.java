/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor_OverLoading;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Persion p1 = new Persion();
        Persion p2 = new Persion("niloy","22");
        Persion p3 = new Persion("omrit","23","male");
        
        System.out.println("\nPersion 1 Information ");
        p1.displayInfo();
        System.out.println("\nPersion 2 Information ");
        p2.displayInfo();
        System.out.println("\nPersion 3 Information ");
        p3.displayInfo();
    }
    
}
