package DSA_LearnAnything;
import java.util.Scanner;

public class TargetSum {
	public static void findTripletSum(int[] arr, int target) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k= j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.printf("The pair is (%d,%d,%d)",arr[i],arr[j],arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The total number of pair is : " + count);
		
	}
	public static void checkIsSum0exist(int[] arr) {
		int count=0;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k =i ;k<=j;k++) {
					
					System.out.print("The subarray : " +  arr[k] + " ");
					count++;
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("total number of subset is : "+ count);
		
	}
	public static void printArray(int[] arr) {
		for(int i=  0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the Array: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter "+ n + "elements in Array: ");
		for(int i= 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("This is my array:");
		printArray(arr);
		System.out.println();
		
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		findTripletSum(arr,target);
		checkIsSum0exist(arr);
		
	}

}
	
