package DSA_LearnAnything;

public class SelectionSort_Algo {
	public static void main(String[] args) {
		int[] arr= {2,3,5,34,21,90,2,6,7,89,1};
		int n= arr.length;
		System.out.println("Array Before Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			
			
			int min_value=arr[min_index];
			for(int k=min_index;k>i;k--) {
				arr[k]=arr[k-1];
			}
			arr[i]=min_value;
		}
		System.out.println();
		System.out.println("Array after Selection Sort: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
