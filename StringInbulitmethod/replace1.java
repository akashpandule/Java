public class replace1 {
    public static void main(String[]args){
        String n="java is most popular programming langaue";
        StringBuffer news= new StringBuffer(n);
        StringBuffer x= news.replace(0,5 ,"india ");
        System.out.println(x);
    }
    
}
