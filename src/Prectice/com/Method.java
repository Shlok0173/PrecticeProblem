package Prectice.com;

import java.util.Scanner;

public class Method {
    public static void main(String args[]) {
    	System.out.println("Enter the value:");
    	Scanner scanner=new Scanner(System.in);
    	int num=scanner.nextInt();
    	
    	evenOrOdd(num);
    	
    }
    	 public static void evenOrOdd( int num) {
    		 if(num%2==0) {
    			 System.out.println("Even...");
    		 }else {
    			 System.out.println("Odd..");
    		 }
       
    	 }
    	
    }
    