import java.util.*;
class arr1{
 public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
  String str=sc.nextLine();
  int sum=0;
  for(int i=0;i<str.length();i++){
    char n=str.charAt(i);
    if(n>='0' && n<='9'){
     sum+=(n-'0');
}
}
  System.out.println(sum);
}
}