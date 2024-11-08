package learnDSA;
// iterative approach
public class IsSortArray {
	public static boolean isSort(int[] nums) {
		if(nums.length==0 || nums.length==1) {
			return true;
		}
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]>nums[i]) {
				return false;
			}
		}
		return true;
	}
//recursive approach
	public static boolean isSorted(int[] nums, int n) {
		
		if(n==0|| n==1) {
			return true;
		}
		return nums[n-1]>=nums[n-2] && isSorted(nums,n-1);
	}
	
// bubble sort algorithms. 
	public static int[] bubbleSort(int[] nums, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp= nums[j];
					nums[j]=nums[j+1];
					nums[j+1]= temp;
				}
			}
			
		}
		return nums;
	}
	
// selection sort algorithms
	public static void selectionSort(int[] nums, int n) {
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j= i+1;j<n;j++) {
				if(nums[j]<nums[minIndex]) {
					minIndex=j;
				}
			}
			// swapping of elements to get the least value at the front position. 
			int temp= nums[i];
			nums[i]=nums[minIndex];
			nums[minIndex]=temp;
		}
		for(int item: nums) {
			System.out.print(item+ " "); 
		}
	}
	public static void main(String[] args) {
		int num[]= {1,2,3,15,5,6,4,10};
		boolean result= isSort(num);
		//int n= nums.length;
		boolean result2=isSorted(num,num.length);
		System.out.println(result2);
		
		System.out.println();
		if(result==true) {
			System.out.println("Array is Sorted:"+ result);
		}else {
			System.out.println("Array is Unsorted: ");
		}
		System.out.println();
		int[] nums=bubbleSort(num,num.length);
		for(int item : nums) {
			System.out.print(item+ " ");
		}
		System.out.println();
		selectionSort(num,num.length);
		
	}

}
