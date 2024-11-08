package learnDSA;
import java.util.ArrayList;
import java.util.Collections;

public class LinearSearch {
	public static int lenearSearch(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	// recursive approach to find the largest value in Array. 
	public static int largestValue(int[] nums, int startIndex) {
		if(startIndex == nums.length-1) 
		{
			return nums[startIndex];
		}
		int recursiveMax= largestValue(nums,startIndex+1);
		return Math.max(nums[startIndex], recursiveMax);
		
	}
	// iterative approach to find the largest value in Array: 
	
	public static int largest(int[] num) {
		int max= num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max= num[i];
			}
		}
		return max;
	}
	// iterate approach to find the minimum value in Array: 
	public static int minimum(int[] num) {
		int minmumValue=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<minmumValue) {
				minmumValue=num[i];
			}
		}
		return minmumValue;
	}
	// recursive approach to find the minimum value in Array: 
	public static int minimumValue(int[] num,int startIndex) {
		if(startIndex==num.length-1) {
			return num[startIndex];
		}
		int recMin=minimumValue(num,startIndex+1);
		return Math.min(num[startIndex], recMin);
	}
	public static int secondSmallest(int[] num ) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]<smallest) {
				secondSmallest=smallest;
				smallest=num[i];
			}
			else if(num[i]>smallest&& num[i]<secondSmallest) {
				secondSmallest=num[i];
			}
		}
		return secondSmallest;
	}
	
	public static int thirdLargest(int[] num ) {
		int Largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]>Largest) {
				thirdLargest=secondLargest;
				secondLargest=Largest;
				Largest=num[i];
			}
			else if(num[i]<Largest&& num[i]>secondLargest) {
				secondLargest=num[i];
			}
			else if(num[i]<secondLargest&&num[i]>thirdLargest) {
				thirdLargest=num[i];
			}
		}
		return thirdLargest;
	}
	// finding Array leaders using Nested loop time O(n^2) and space O(1) 
	// Naive Approach
	public static ArrayList<Integer> arrayLeaders(int[] nums){
		ArrayList<Integer> result= new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int j;
			for( j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					break;
				}
			}
			if(j==nums.length) {
				result.add(nums[i]);
			}
		}
		return result;
	}
	// Minimum suffix approach : time O(N) and space O(1) 
	public static ArrayList<Integer> leaders(int[] nums){
		
		ArrayList<Integer> result= new ArrayList<Integer>();
		int rightMax= nums[nums.length-1];
		result.add(rightMax);
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]>rightMax) {
				rightMax=nums[i];
				result.add(rightMax);
			}
		}
		Collections.reverse(result);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		int[] nums= {3,0,6,7,8,12,34,1};
		int target = 120;
//		int result=lenearSearch(nums,target);
//		if(result!=-1) {
//			System.out.println("Element found at Index: "+ result);
//		}else {
//			System.out.println("Elements not present : "+ result);
//		}
		
		int maxValue=largestValue(nums,0);
		System.out.println("The maximum value in the Array is: " + maxValue);
		System.out.println();
		int maximumValue= largest(nums);
		System.out.println("The maximum value in the Arrray is: "+ maximumValue);
		int minimumValue= minimum(nums);
		System.out.println("The manimum value in the Arrray is: "+ minimumValue);
		int minValue= minimumValue(nums,0);
		System.out.println("The manimum value in the Arrray is: "+ minValue);
		int seconSmall=secondSmallest(nums);
		System.out.println("The second minimum value in Array is: "+ seconSmall);
		int thirdlargest=thirdLargest(nums);
		System.out.println("The Third Maximum Value in Array is: "+ thirdlargest);
		ArrayList<Integer> result= arrayLeaders(nums);
		for(int item : result) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		ArrayList<Integer> arrayLeader= leaders(nums);
		for(int item : arrayLeader) {
			System.out.print(item + " ");
		}
	}

}
