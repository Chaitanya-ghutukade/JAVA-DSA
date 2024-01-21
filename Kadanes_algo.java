public class Kadanes_algo {

    public static void main(String[] args){
        int[] numbers={1,-2,6,-1,3};
        kadanes(numbers);
    }
    public static void kadanes(int[] num){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currentsum += num[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);

        }
        System.out.println("maximum sum of subarray is:"+maxsum);
    }
}
