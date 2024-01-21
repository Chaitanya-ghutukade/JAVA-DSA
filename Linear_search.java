public class Linear_search
{
    public static void main(String[] args)
    {
       int[] numbers={2,4,6,8,10,12,14};
       int data=101;
       int num=linearsearch(numbers,data);
       if(num==-1){
           System.out.println("element does not exits");
       }else{
           System.out.println("element is present at index:"+num);
       }

    }
    public static int linearsearch(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}