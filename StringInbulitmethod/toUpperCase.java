import java.util.Scanner;

public class toUpperCase {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter you String");
    String n=sc.nextLine();
    System.out.println(n.toLowerCase());  // it is used to covert upper case to lower cae 
    System.out.println(n.toUpperCase());  // it is used to convert lower case to upper case in particulart sring
  }  
}
