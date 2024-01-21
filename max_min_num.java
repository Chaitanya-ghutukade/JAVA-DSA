public class max_min_num{
    public static void main(String[] srgs) {
          int[] numbers={11,2,6,3,5};
          System.out.println("max num is:"+largest(numbers));
        System.out.println("min num is:"+smallest(numbers));

    }
    public static int largest(int[] arr){
        int largest =Integer.MIN_VALUE;// we can also take largest=arr[0] and start loop from 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
        return largest;
    }
    public static int smallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];

            }
        }
        return smallest;
    }



}


