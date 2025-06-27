package packagecom.numbers;

import java.util.Arrays;

public class clas2addele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ele =45;
int ind=4;
int arr[]= {10,20,30,50,60,70,80};
//(0,0,0,00,0,0,0,)
int []res=new int[arr.length+1];
for(int i=0;i<ind;i++) {
	res[i]=arr[i];
	//10,20,30,50
}
res [ind]=ele;
for(int i=ind;i<arr.length;i++) {
	res[i+1]=arr[i];
	//10,20,30,50,45,60,70,80
}
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(res));
	}

}
