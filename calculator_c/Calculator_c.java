
package calculator_c;

import java.util.Scanner;
public class Calculator_c {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a= sc.nextDouble();
        System.out.println("Enter the secont number");
        double b = sc.nextDouble();
        System.out.println("select the operation +,-,*,/");
        char op = sc.next().charAt(0);
        switch(op){
            case '+' : System.out.println("result" +(a+b));
            break;
            case '-': System.out.println("Result" +(a-b));
            break;
            case '*': System.out.println("Result" +(a*b));
            break;
            case '/': if(b!=0){
                System.out.println("result" +(a/b));
                
            }
            else{
                System.out.println("cannot divisible by zero");
            }
            break;
            default : System.out.println("invalid choice");
        }
    }
    
}
