import java.util.*;
public class reversestring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] str=s.split(" ");
        String newstring="";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                newstring=newstring+str[i].charAt(j);
            }
            newstring+="";
        }
        System.out.println(newstring);
    }
    
}
