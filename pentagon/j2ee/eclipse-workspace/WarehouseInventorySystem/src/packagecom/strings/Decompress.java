package packagecom.strings;

//Decompress.java
public class Decompress {

 public static String decompress(String s) {
     String res = "";

     for (int i = 0; i < s.length(); i += 2) {
         char ch = s.charAt(i);
         int count = Character.getNumericValue(s.charAt(i + 1));
         for (int j = 0; j < count; j++) {
             res = res + ch;
         }
     }

     return res;
 }

 public static void main(String[] args) {
     String s = "a2b2c5";
     String result = decompress(s);
     System.out.println("Decompressed String: " + result);
 }
}
