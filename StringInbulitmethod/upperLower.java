class upperLower{
    public static void main(String[]args){
        String ch="AkashPanduleA";
        int upper=0;
        for(int i=0;i<ch.length();i++){
            char ch1=ch.charAt(i);
            if(ch1>='A' && ch1<='Z'){
               upper++;
               System.out.println(upper);
            }
            
        }
        
    }
}