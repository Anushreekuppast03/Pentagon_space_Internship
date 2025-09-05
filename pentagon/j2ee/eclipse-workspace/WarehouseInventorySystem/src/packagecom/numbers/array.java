package packagecom.numbers;


public class array{
    public static boolean isSortedAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])   //1<0
return false;
        }
        return true;
    }

    public static void main(String args[]) {   
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println(" arr2 sorted " + isSortedAsc(arr2));
        System.out.println("arr3 sorted " + isSortedAsc(arr3));

}}
