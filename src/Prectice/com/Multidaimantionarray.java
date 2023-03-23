package Prectice.com;

public class Multidaimantionarray {
    public static void main(String args[]) {
    	int row=3;
    	int col=3;
    	   int twoDArray [] []=new int [row] [col];
    	   
    	   twoDArray[0][0]=12;
    	   twoDArray[0][1]=14;
    	   twoDArray[0][2]=16;
    	   twoDArray[1][0]=1555;
    	   twoDArray[1][1]=15;
    	   twoDArray[1][2]=20;
    	   twoDArray[2][0]=40;
    	   twoDArray[2][1]=60;
    	   twoDArray[2][2]=34;
    	   
    	   for(int i=0;i<row;i++) {
    		   for(int j=0;j<col;j++) {
    			//   System.out.println("twoDArray+["+i+"]["+j+"]="+twoDArray[i][j]+"\t");
    			   System.out.print(twoDArray[i][j]+"\t");
    		   }
    		   System.out.println();
    	   }
    	   }
}
