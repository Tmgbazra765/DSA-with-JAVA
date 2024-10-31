package basic;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
////		String s="2.345678";
////		System.out.println("S = " + s);
////		s+=23;
////		System.out.println("S = "+ s);
////		Double x= new Double(s);
////		System.out.println(x);
////		x=x+45;
////		System.out.println(x);
////		int y= x.intValue();
////		System.out.println(y);
////		int n= Integer.parseInt("476",8);
////		System.out.println(n);
////		
//		
////	
//		System.out.println("Enter number:");
//		Scanner sc= new Scanner(System.in);
//		int num= sc.nextInt();
//		int fact=1;
//		int i=1;
//		while(i<=num) {
//			fact= fact*i;
//			i++;
//		}
//		System.out.println(fact);
		//		 int reverse = 0; 
//		 while (num !=0) {
//			 reverse=reverse*10;
//			 reverse=reverse+(num%10);
//			 num=num/10;
//			 
//		 }
//		 System.out.print(reverse);
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		System.out.println("Enter the value of row");
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=i;i<=r;j++) 
			{
				System.out.print(j);
			}
			for(int k=1;k<=i-1;k++) 
			{
				System.out.print(k);
			}
			System.out.println();
		}
		

}
}
