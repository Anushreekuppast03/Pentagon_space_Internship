package packagecom.numbers;

public class SumOfElementswioutcount {
	public static void main(String[] args) {
		int[] arr= {12,23,34,45,56,67,78,89};
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+sum/arr.length);
	}

}
