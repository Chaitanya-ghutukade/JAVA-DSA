public class Reversing_array {

    public static void main(String[] args){
        int[] numbers={2,4,6,8,10,12,14,16,18,20};
        reverse(numbers);
        //print array
         for(int i=0;i<numbers.length;i++)
         {
             System.out.print(numbers[i]+" ");
         }
    }
    public static void reverse(int[] numbers){
        int start=0,end=numbers.length-1;
        //swaping array
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }

}
