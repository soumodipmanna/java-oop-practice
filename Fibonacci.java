
package fibonacci;

import java.util.Scanner;
public class Fibonacci {

   
    public static void main(String[] args) {
       int n,a,b,c,i;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of times u want fibonacci series");
        n = sc.nextInt();
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        System.out.println("the fibonacci series is" );
        for(i=1;i<=n;i++){
            System.out.println(a +"");
            c=a+b;
            a=b;
                b=c;    
        }
    }
    
}
