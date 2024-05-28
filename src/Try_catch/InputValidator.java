/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Try_catch;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class InputValidator {
    public boolean validInput(int input){
        if(input<1)
        {
            System.out.println("Invalid Input");
            return false;
        }
        else if(input>10)
        {
            System.out.println("Invalid Input");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator validator = new InputValidator();
        
        while(true){
            System.out.println("Inter a Input : ");
            String userInput = sc.nextLine();
            
            try{
                int input = Integer.parseInt(userInput);
                
                if (validator.validInput(input)) {
                    System.out.println("Input accepted: " + input);
                    break; // Exit the loop if the input is valid
                }
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Input must be a number.");
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
