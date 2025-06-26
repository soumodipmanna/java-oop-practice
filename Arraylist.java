package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
ArrayList<String> student=new ArrayList<String>();
Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of students");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter the names of student:");
            student.add(sc.nextLine());
        }
        System.out.println("list of students are:-" +student);
        for(int j=0;j<student.size();j++){
            System.out.println((j+1)+"." +""  +student.get(j));
        }
    }
    
}
