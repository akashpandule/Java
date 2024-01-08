import java.util.*;
class armstrongNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(n>0){
            int reminder=n%10;
            count=count+(reminder*reminder*reminder);
            n=n/10;

        }
        if(temp==count){
            System.out.println("this is armstrong number");
        }else{
            System.out.println("this is not armstrong number");
        }
    }
}