import java.util.Scanner;
public class leapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year");
        int leap_year=sc.nextInt();
        if(leap_year%4==0  && leap_year%100==0 && leap_year%400==0){
            System.out.println("this yearis leap year");
        }else{
            System.out.println("this is not leap year");
        }
        }
    }

