import java.util.Scanner;
public class monthPresen {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your month");
        int month=sc.nextInt();
        switch(month){
            case 1:{
                System.out.println("jan");
                break;
            }
            case 2:
            {
                System.out.println("Feb");
                break;
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
                break;
            }
            case 5:{
                System.out.println("May");
                break;
            }
            case 6:{
                System.out.println("Jun");
                break;
            }
            case 7:{
                System.out.println("jully");
                break;
            }
            case 8:{
                System.out.println("Aug");
                break;
            }
            case 9:{
                System.out.println("Sep");
                break;
            }
            case 10:{
                System.out.println("Oct");
                break;
            }
            case 11:{
                System.out.println("Novmber");
                break;
            }
            case 12:{
                System.out.println("DEC");
                break;
            }
            default:{
                System.out.println("Invalid month");
            }
        }
    }
}
