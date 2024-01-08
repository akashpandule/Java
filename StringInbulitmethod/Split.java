import java.util.*;
class split{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String n=sc.nextLine();
        String [] t=n.split(" ");
        for(int i=0;i<=n.length();i++){
            System.out.println(t[i]);
        }
    }
}


// split it is the one excption called as split exception 
// it is used to string split mean line by line is called as split