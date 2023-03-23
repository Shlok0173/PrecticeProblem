package Prectice.com;
     
class Collage{
	
	public void Department(int num) {
		System.out.println("Department code Dp-0101");
	}
	
	public void Department(String name) {
		System.out.println("Department name");
	}
	public void Department(float room) {
		System.out.println("Deaprtement room");
	}
}

class Office extends Collage{
//@Override.
	public void Department(String name) {
		System.out.println("Department name with Student");
	}
	//@Override.
	public void Department(int num) {
		System.out.println("Department code will be change OF-1000");
	}
}

public class Polymerphism {
    public static void main(String args []) {
    //	Collage clg=new Collage();
    	//clg.Department(2);
    	//clg.Department("cse");
    	//clg.Department(1.2f);
    	Collage clg=new Office();
    	clg.Department("Shlok");
    	clg.Department(23);
    }

}
