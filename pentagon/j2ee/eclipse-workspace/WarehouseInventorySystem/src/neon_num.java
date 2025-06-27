

import java.util.Scanner;

public class neon_num {

    // Method to calculate sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int digitSum = sumOfDigits(square);

        if (digitSum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is NOT a Neon Number");
        }

        sc.close();
    }
}