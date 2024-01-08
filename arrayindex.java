import java.util.Scanner;
public class arrayindex {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your arry size");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter the size"+size+"value initiloze value");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
