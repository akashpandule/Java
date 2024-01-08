class p1{
    public static void main(String[]args){
     String s="saajjk678 976ffdgh";
      int sum=0;
      for(int i=0;i<s.length();i++){
        char n=s.charAt(i);
       if(n>='0' && n<='9'){
       sum+=(n-'0');
   }
   }
    System.out.println(sum);
   }
   }