public class Pairs_in_arrays {

    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5};
        printpair(numbers);

    }
    public static void printpair(int[] num)
    {
        int totalpairs=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("("+num[i]+","+num[j]+")"+" ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs are:"+totalpairs);
    }

}

   //interviewer can ask to find total number of pairs
  // formula to find total number of pairs is totalpairs=n(n-1)/2;----->very important
  //use this formula to find total number of pairs;