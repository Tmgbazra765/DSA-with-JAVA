package DSA_LearnAnything;
import java.util.Arrays;
import java.util.Scanner;

public class PairSUM {
	//brute force method 
	public static void findTarget(int[] nums , int target) {
		
		// printing of array
		System.out.println("This is unsorted array");
		for(int i=0;i<=nums.length-1;i++) 
		{
			System.out.println(nums[i]);
		}
		
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					System.out.printf("found pair is (%d,%d)",nums[i],nums[j]);
					
				}
			}
		}
		System.out.println();
		return;
		
	}
	//using of sorting method. 
	public static void findPairUsingSort(int[] num,int sum) {
		Arrays.sort(num);
//		System.out.println("this is sorted array");
		for(int i=0;i<=num.length-1;i++) 
		{
			System.out.println(num[i]);
		}
		int low= 0 ;
		int high= num.length -1;
		while (low<high) {
			if(num[low] + num[high]== sum) {
				System.out.printf("Pair found  :(%d,%d) ",num[low], num[high]);
			}
			if(num[low] + num[high]<sum) {
				low++;
			}else {
				high--;
			}
			System.out.println();
		}
		System.out.println();
		return;
		
	}
	public static void findMax(int[] num) {
		
		int ans=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>ans) {
				ans=num[i];
			}
		}
		System.out.println("The max value of Array is : " + ans);
		System.out.println();
		
		int i=0;
		ans=num[i];
		while(i<num.length) {
			if(num[i]>ans) {
				ans=num[i];
			}
			i++;
		}
		System.out.print("The max value is : "+ ans);
		
	}
	public static void searchElement(float[] fornum) {
		System.out.println("Please enter the Element to be searched: ");
		Scanner sc = new Scanner(System.in);
		int element= sc.nextInt();
		
		int i=0;
		while(i<fornum.length) {
			if(element==fornum[i]) {
				System.out.print("Element exist in index number :"+ i);
			}
			i++;
			
		}
//		System.out.println("It is not exist");
		
	}
	
	public static void main(String args[]) {
		int[] num= {9,4,1,6,7,2,8};
		float[] fornum= {4,5,7,9,1,3};
		int target=7;
		System.out.println("Using brute force method: ");
		findTarget(num,target);
		System.out.println("Using Sorting method");
		findPairUsingSort(num,target);
		System.out.println("Finding of Max value:");
		findMax(num);
		System.out.println("Search the Element to be exist or not ");
		searchElement(fornum);
		
		
		
	

}
}
