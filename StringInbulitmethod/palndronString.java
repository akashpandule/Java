import java.util.*;
public class palndronString {
   Scanner sc=new Scanner(System.in);
   String  str=sc.nextLine();
   String temp= " ";
   for(int i=str.length()-1;i>=0;i--){
    temp=temp+str.charAt(i);
   } 
   System.out.println(temp);
}
