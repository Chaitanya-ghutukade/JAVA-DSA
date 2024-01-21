public class Subarrays {

    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5};
        printsubarray(numbers);

    }
    public static void printsubarray(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
