
package atm_machine;

import java.util.Scanner;
class atmmachine{
    Scanner am = new Scanner(System.in);
    double balance=1000;
    public void checkBalance(){
        System.out.println("your balance is:" +balance);
    }
    public void deposite(){
        System.out.println("Enter the amount to deposite");
        double amount = am.nextDouble();
        balance += amount;
        System.out.println( amount +"deposited successfully");
        checkBalance();
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdraw");
        double amount = am.nextDouble();
        if( amount <= balance ){
            balance -= amount;
            checkBalance();
        }
        else{
            System.out.println("insufficient balance");
        }
        
    }
}
public class ATM_machine {

   
    public static void main(String[] args) {
       atmmachine a = new atmmachine ();
       while(true){
           System.out.println("ATM MENU:-");
           System.out.println("1.check balance");
           System.out.println("2.deposite");
           System.out.println("3.withdraw");
           System.out.println("4.exit");
           System.out.println("Enter your choice");
           Scanner sc = new Scanner(System.in);
           int choice= sc.nextInt();
           switch(choice){
               case 1 : a.checkBalance();
               break;
               case 2 : a.deposite();
               break;
               case 3 : a.withdraw();
               break;
               case 4 : System.exit(0);
               default : System.out.println("Invalid choice");
           }
       } 
       
    }
    
}
