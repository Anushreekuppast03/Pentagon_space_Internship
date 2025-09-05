package packagecom.numbers;

public class sums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of pairs with sum " + k + " is: " + count);
    }
}

