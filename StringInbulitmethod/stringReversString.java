public class stringReversString {
    public static void main(String[]args){
        String s="java is a secured programming langauge";
        String[] str= s.split(" ");
        String news="";
        for(int i=0;i<str.length;i++){
            StringBuilder sb= new StringBuilder(str[i]);
            news+=sb.reverse()+" ";
        }
        System.out.println(news);

    }
    
}
// with help of the string  bulder wwe can perfrom the reverse string oprattion here 
// and this is new one more method we can perform the same output
