public class reversstring {
    public static void main(String[]args){
        String s="java is object orinted programming language";
        String []str=s.split(" ");
        String newstring=" ";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                newstring=newstring+str[i].charAt(j);
                
            }
            newstring=newstring+"";
            
        }
        System.out.println(newstring);

    }
}
