package java_oops;

public class code27_constructor {
	
	String empname;
	int empid;
	String dept;
	
	code27_constructor(String s, int i, String d){
		empname = s;
		empid = i;
		dept = d;
	}
	
	void display() {
		System.out.println("Employee " +empname + " with the id " +empid + " is working in the " +dept +" department");
	}
	
	public static void main(String[] args) {
		
		code27_constructor code = new code27_constructor("Ash", 12924, "Trainer");
		
		code.display();
	}

}
