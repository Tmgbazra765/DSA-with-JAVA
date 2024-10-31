package DSA_LearnAnything;

public class BubbleSort {
	public static void enhancedSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("Array After Enhanced bubble sort: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {3,5,6,10,21,5,23,4,1};
		System.out.println("Array befor Sorting: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after Bubble Sort: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		enhancedSort(arr);
	}

}
