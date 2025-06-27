package packagecom.numbers;

import java.util.Arrays;

public class maxminsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {34,76,87,9,34,03};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println(max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println(min);
		System.out.println(min+max);
	}

}
