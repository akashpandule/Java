import java.util.Scanner;
class CountLett
{
   public static void main(String[] args)
    {
      int Letter=0;
      int Special=0;
     int  num=0;
      Scanner sc=new Scanner(System.in);
      String [] str=s.split("");
     for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)< 'Z' || str.charAt(i)>='a' && str.charAt(i)<='z')
            {
               Letter++;
             }
          else if(str.charAt(i)>=47 && str.charAt(i)<=56)
          {
          num++;
          }
        else
        {
          Special++;
}
        }
        
   System.out.println(Letter);
   System.out.println(Special);
System.out.println(num);
        
    }
    }
