package Prectice.com;

public class Array3 {
	
       public static void main(String args[]) {
    	   int []arr=new int[] {123,45,266,77,88,100};
    	   int temp=0;
    	   
    	   
    	   //Display element of original array
    	   System.out.println("Element of original array");
    	   for(int i=0;i<arr.length;i++) {
    		   System.out.println(+arr[i]);
    	   }
    	   
    	   System.out.println("*****Sort By accending order");
    	   for(int i=0;i<arr.length;i++) {
    		   for(int j=i+1;j<arr.length;j++) {
    			   if(arr[i]>arr[j]) {
    				   temp=arr[i];
    				   arr[i]=arr[j];
    				   arr[j]=temp;
    			   }
    		   }
    	   }
    	   System.out.println();
    	   System.out.println("******After Sorting Display Elements****");
    	   for(int i=0;i<arr.length;i++) {
    		   System.out.println(arr[i]+" ");
    	   }
       }
}
