public class sumodeven {
    public static void main(String[]args){
        int [] arr={12,43,4,5,7,8};
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            sum=sum+arr[i];
            }
            if(arr[i]%2!=0){
                sum1=sum1+arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
