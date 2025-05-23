
package prime_numbercheck;
import java.util.Scanner;

public class Prime_Numbercheck {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        while(true){
            int num;
            
        System.out.println("Enter the number");
        num = sc.nextInt();
       
        if(num%2!=0 && num>0){
            System.out.println("it is a prime number");
        }
        else if(num%2==0){
            System.out.println("it is not a prime number");
        }
       
        else{
            System.out.println("invald coice");
            System.exit(0);
        }
            }
    }
    
}
