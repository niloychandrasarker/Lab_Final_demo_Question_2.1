/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Student s1 = new Student("01","Niloy");
        s1.desplayInfo();
        
        s1.elrollCourse("OOP");
        
        s1.desplayInfo();
        
        System.out.println("Student Name : "+ s1.getStudentId());
        System.out.println("Student Name : "+ s1.getStudentName());
        
    }
}
