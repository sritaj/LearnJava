
public class code22_object {
	
	String empname;
	int empid;
	String dept;
	
	public static void main(String[] args) {
		
		code22_object obj1 = new code22_object();
		obj1.empname = "Ash Ketchum";
		obj1.empid = 20147;
		obj1.dept = "Trainer";
		
		code22_object obj2 = new code22_object();
		obj2.empname = "Brock";
		obj2.empid = 30192;
		obj2.dept = "Leader";
		
		code22_object obj3 = new code22_object();
		obj3.empname = "Gary";
		obj3.empid = 21456;
		obj3.dept = "Researcher";
		
		System.out.println("Empoyee " + obj1.empname + " with the employee ID " +  obj1.empid + " is working in the " + obj1.dept + " department");
		System.out.println("Empoyee " + obj2.empname + " with the employee ID " +  obj2.empid + " is working in the " + obj2.dept + " department");
		System.out.println("Empoyee " + obj3.empname + " with the employee ID " +  obj3.empid + " is working in the " + obj3.dept + " department");
	}

}
