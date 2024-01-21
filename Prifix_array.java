
public class Prifix_array {

    public static void main(String[] args){
        int[] numbers={1,-2,6,-1,3};
        Max_subarray_sum(numbers);
    }
    public static void Max_subarray_sum(int[] num){

        int[] prefix=new int[num.length];
        int currentsum=0 ;
        int maxsum= Integer.MIN_VALUE;
        prefix[0]=num[0];
        //calculate prefix array
        for(int k=1;k<num.length-1;k++) {
            prefix[k] = prefix[k - 1] + num[k];
        }

            for(int i=0;i<num.length;i++) {


                for (int j = 0; j < num.length; j++) {

                    currentsum = i==0 ? prefix[j]: prefix[j] - prefix[i - 1];
                    if( currentsum>maxsum){
                        maxsum=currentsum;
                    }
                }
            }

     System.out.println("maximum sum is :"+maxsum);
    }
}
