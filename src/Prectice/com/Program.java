package Prectice.com;

import java.util.Scanner;

public class Program {

	public static void main(String args[]) {
		Scanner shlok=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=shlok.nextInt();
		System.out.println("show input:"+number);
		
		if(number>0) {
			System.out.println("its possative number");
		}
	}

}
