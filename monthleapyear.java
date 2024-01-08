import java.util.Scanner;
public class monthleapyear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        if(month>=28){
            System.out.println("this is leap year");
        }else{
            System.out.println("this is not leap year month");
        }
    }
    
}
