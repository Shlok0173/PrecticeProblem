package Prectice.com;

import java.util.Scanner;

public class Dublicatearray {
   public static void main(String args[]) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the value");
	   
	   int size=scanner.nextInt();
	   int arr[]=new int[size];
	   
	   for(int i=0;i<=arr.length;i++) {
		   for(int j=0;j<=i+1;j++) {
			   System.out.println(arr[j]);
		   }
	   }
   }
}
