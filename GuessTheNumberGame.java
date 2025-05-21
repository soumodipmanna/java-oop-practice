/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apnacollegepro;
import java.util.Scanner;
public class Apnacollegepro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber=0;
        do{
            System.out.println("Guess my number");
            userNumber = sc.nextInt();  
            if(userNumber == myNumber){
                System.out.println("WOOHHOOO .. CORRECT NUMBER!!");
            
            break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
            }while(userNumber >= 0);
        System.out.println("my number was :");
        System.out.println(myNumber);
        }
    }
    

