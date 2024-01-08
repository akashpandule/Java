import java.util.*;
public class string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String number");
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<=n.length();i++){
            count++;
        }
        System.out.println(count);
    }
    
}
