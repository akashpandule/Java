public class count {
   public static void main(String[]args){
    String s="java is good programming language";
    String [] str=s.split("");
    int count=0;
    for(int i=0;i<str.length;i++){
        count++;
    }
    System.out.println(count);

   }  
}
