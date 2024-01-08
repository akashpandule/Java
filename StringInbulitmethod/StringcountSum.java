public class StringcountSum {
    public static void main(String[]args){
        String n= "akash janardhan pandue";
        String [] str= n.split(" ");
        int count=0;
         for(int i=0;i<=str.length;i++){
            for(int j=0;i<=str[i].length();j++){
                if(str[i].charAt(j)>='0' && str[i].charAt(j)<='9'){
                    count=count+Integer.parseInt(str[i].charAt(j)+" ");
                }
            }
            System.out.println(count);

         }
    }
}
