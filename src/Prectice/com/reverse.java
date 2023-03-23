package Prectice.com;

public class reverse {
     public static void main(String args[]) {
    	 int arr[]= {1,2,3,4,5,6,7,8,9};
    	 int n=Math.floorDiv(arr.length,2);
    	 int temp;
    	 int l=arr.length;
    	 for( int i=0;i<=n;i++) {
    		 temp=arr[i];
    		 arr[i]=arr[l-i-1];
    		 arr[l-i-1]=temp;
    		// System.out.println(temp);
    	 }
    	
     }
}
