package Prectice.com;

import java.util.Scanner;

public class Leap {
    public static void main(String args[]) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the vlaue:");
    	
    	int a=scanner.nextInt();
    	
    	if(a%4==0) {
    		System.out.println("leap year");
    	}else {
    		System.out.println("not leap year");
    	}
    }
}
