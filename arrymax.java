public class arrymax {
    public static void main(String[]args){
        int[] ar={12,43,1,45,345};
        int max=ar[0];
        int min=ar[0];
    
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max)
                max=ar[i];
         if(ar[i]<min)
            min=ar[i];
         
        }
    
        System.out.println(max);
        System.out.println(min);
    }
}

