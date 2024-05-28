/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author DELL
 */
public class Student {
    private String StudentId;
    private String StudentName;
    private String Course;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public Student(String StudentId, String StudentName) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
    }
    
    
    public void elrollCourse(String Course){
        this.Course= Course;
    }
    
    public void desplayInfo(){
        System.out.println("Student Id: "+ StudentId);
         System.out.println("Student Id: "+ StudentName);
          System.out.println("Student Id: "+ Course);
    }
}
