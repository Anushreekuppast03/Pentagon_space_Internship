package packagecom.strings;

import java.util.Arrays;

public class ANAGRAM {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }
    }
}
