package Prectice.com;

import java.util.Scanner;

public class Swap {
     public static void main(String args[]) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter the value");
    	 int x=scanner.nextInt();
    	 int z;
    	 System.out.println("Enter the value");
    	 int y=scanner.nextInt();
    	 
    	 System.out.println("print the value before swapping"+x+y);
    	 
    	 z=x;
    	 x=y;
    	 y=z;
    	 
    	 System.out.println("print the value after swapping"+x+y);
    	 
     }
}
