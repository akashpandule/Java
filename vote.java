import java.util.Scanner;
class vote{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18){

            System.out.println("eligible for voting");
        }else{
            System.out.println("Not eligible for voting");
        }

    }
}