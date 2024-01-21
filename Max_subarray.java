public class Max_subarray {
    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5,8,7};
        printsubarray(numbers);
    }
        public static void printsubarray(int[] num)
        {   int count=0;
            int sum=0;
            int largesum=Integer.MIN_VALUE;
            for(int i=0;i<num.length;i++)
            {
                for(int j=i;j<num.length;j++)
                {
                    sum=0;
                    for(int k=i;k<=j;k++)
                    {
                       sum+=num[k];
                    }
                    System.out.println(sum);
                    if(sum>largesum){
                        largesum=sum;
                    }
                }
                System.out.println();
            }
            System.out.println("largest sum is:"+largesum);
    }
}
