/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor_OverLoading;

/**
 *
 * @author DELL
 */
public class Persion {
    String Name;
    String Age;
    String Gender;

    public Persion() {
    }

    public Persion(String Name, String Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public Persion(String Name, String Age, String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }
    public void displayInfo(){
         System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
    }
}
