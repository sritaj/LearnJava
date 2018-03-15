package java_oops;

public class code28_this {

	String empname;
	int empid;
	String dept;
	
	code28_this(String empname, int empid, String dept){
		
		this.empname = empname;
		this.empid = empid;
		this.dept = dept;
		
		System.out.println(empname + " with the id " +empid + " is woking in the " +dept + " department");
	}
	
	public static void main(String[] args) {
		
		code28_this code = new code28_this("Paul", 19850, "Trainer's");
	}
}
