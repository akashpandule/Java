import java.util.*;
public class StringCharctercount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String");
        String str=sc.nextLine();
        String [] t=str.split(" ");
        int count=0;
        for(int i=0;i<str.length();i++){
           System.out.println(t[i]);
        }
      
    }
    
}
