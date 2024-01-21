public class Binary_search {

    public static void main(String[] s) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};// sorted array
        int data = 14;
        System.out.println("element is present at index:"+binarysearch(numbers,data));

    }
       //prerequisite for binary search is array must be sorted;
    public static int binarysearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;

         while(start<=end) {
             int mid=(start+end)/2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                start = mid + 1;
            }
            else {
              end=mid-1;
            }
        }
        return -1;
    }
}
