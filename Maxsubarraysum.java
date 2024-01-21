public class Maxsubarraysum {

    public static void main(String[] args){
        int[] numbers={1,-2,6,-1,3};
        maxarray_sum(numbers);
    }
    public static void maxarray_sum(int[] num)
    {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            for (int j = i; j < num.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + num[k];
                }
                System.out.println(sum);
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println("maximum sum of an array is :"+maxsum);

    }
}
