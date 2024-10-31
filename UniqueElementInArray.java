package DSA_LearnAnything;
import java.util.Arrays;

public class UniqueElementInArray {
//	public static void findUniqueElement(int[] arr) {
//		//int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=-1;
//					arr[j]=-1;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>-1) {
//				System.out.println("The unique element of Array is : " + arr[i]);
//			}
//		}
//		
//	}
	
	
	public static int findMax(int[] arr) {
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		return max;
	}
	public static void findsecondMax(int[] arr) {
		int max=findMax(arr);
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==max) {
			arr[i]=Integer.MIN_VALUE;
		}
		}
		
		int secondMax=findMax(arr);
		System.out.println("The second maximum maximum Value of Array is: " + secondMax);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {3,14,51,7,30,41,5};
//		int[] arr1= {-1,-2,45,39,2,4,5,6,-43};
		///findUniqueElement(arr);
		//System.out.println();
		findsecondMax(arr);		
		
	}

}
