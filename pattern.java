package basic;

import java.util.Scanner;

public class pattern {
public static void main(String[] args) {
	
		int binary_digit=1001;
		int i=0,ans=0;
		while(binary_digit>0){
		    int x = binary_digit%10;
		    ans=(int) (ans + x *( Math.pow(2,i)));
		    binary_digit=binary_digit/10;
		    i++;
		}
		System.out.println(ans);
		}
}
//	System.out.println("Enter the value of row: ");
//	Scanner sc= new Scanner(System.in);
//	int r= sc.nextInt();
//	System.out.println("Enter the column number: ");
//	int col=sc.nextInt();
//	for(int i= 1 ;i<=r;i++) {
//		for(int j=1;j<=col;j++) {
//			if((i+j)%2==0) {
//				System.out.print(2);
//				}else {
//					System.out.print(1);
//				}
//		}
//		System.out.println();
//	}
	
//	for(int i=1;i<=r;i++)
//	{
//		for(int j=i;j<=r;j++) 
//		{
//			System.out.print(j);
//		}
//		for(int k=1;k<=i-1;k++) 
//		{
//			System.out.print(k);
//		}
//		System.out.println();
//	}

