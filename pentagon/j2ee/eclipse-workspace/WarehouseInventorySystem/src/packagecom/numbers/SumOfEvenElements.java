package packagecom.numbers;

public class SumOfEvenElements {
	public static void main(String[] args) {
		int[] arr= {12,23,34,45,56,67,78,89};
		float sum=0.0f;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			sum+=arr[i];
			count++;
			}
		}
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+sum/count);
	}

}
