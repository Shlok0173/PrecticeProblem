package Prectice.com;
//create van class


class Faculity{
	protected String color;
	protected String size;
	protected String language;
	protected long number;
	
	
	protected void CseDepartment (){
		
	}
}

class Student extends Faculity{
	protected void Mechanical () {
		
	}
}
public class Inhheritance {
 public static void main(String args[]) {
	 Student student=new Student();
	 student.CseDepartment();
	 student.Mechanical();
	 
 }
}
