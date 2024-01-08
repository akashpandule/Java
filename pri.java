class Pri
{
    public static void main(String[] args)
    {
        int arr[]={23,4,7,8,9,0,3,5};
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    count++;
                }

            }

        }
 
    }
}