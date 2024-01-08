public class copyar {
    public static void main(String[]args){
        int [] arr1={12,23,21,11};
        int []arr2=new int[arr1.length];
        arr2=arr1;
    
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for(int a=0;a<arr2.length;a++){
            System.out.println(arr2[a]);
        }
        
    }
    
}
