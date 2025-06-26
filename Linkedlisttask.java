
package linkedlisttask;
import java.util.Scanner;
import java.util.LinkedList;
public class Linkedlisttask {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String choice="y";
        while(choice.equalsIgnoreCase("y")){
            System.out.println("1.add task,2.remove task,3.view task,4.exit");
            System.out.println("enter your choice");
            int x=sc.nextInt();
            sc.nextLine();
            if (x==1){
                System.out.println("enter the new task");
                String task=sc.nextLine();
                tasks.add(task);
                System.out.println("task added");
            }
            else if (x==2){
                if(tasks.isEmpty()){
                    System.out.println("there is no task to remove");
                }
                else{
                    System.out.println("enter the task number to be removed");
                    int index=sc.nextInt();
                    sc.nextLine();
                    if(index>0 && index<=tasks.size()){
                        tasks.remove(index-1);
                        System.out.println("tasks removed successfully");
                    }
                    else{
                        System.out.println("invalid choice");
                    }
                }
                    
            }
            else if (x==3){
                if(tasks.isEmpty()){
                    System.out.println("there is no tasks in the list to show");
                }
                else{
                for(int i=0;i<tasks.size();i++){
                    System.out.println(i+1 +"."+tasks.get(i));
                }
                }
            }
            else if(x==4){
                System.out.println("exiting programm......");
            }
            else{
                System.out.println("invalid coice");
            }
            System.out.println("do you want to continue y/n");
            choice=sc.nextLine();
        }
        
    }
    
}
