
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] option = {"rock","paper","scissor"};
        Random rand = new Random();
        System.out.println("Enter rock, paper or scissor");
        String userchoice= sc.next().toLowerCase();
        String compchoice = option[rand.nextInt(3)];
        System.out.println("computer choose" +compchoice); 
        if (userchoice.equals(compchoice)) {
            System.out.println("it is draw");
        } else if(userchoice.equals("rock") && compchoice.equals("scissor")){
            System.out.println("you won");
        }
        else if(userchoice.equals("paper") && compchoice.equals("rock")){
            System.out.println("you won");
        }
        else if(userchoice.equals("scissor") && compchoice.equals("paper")){
            System.out.println("you won");
        }
        else{
            System.out.println("you lose");
        }
    }
    
}
