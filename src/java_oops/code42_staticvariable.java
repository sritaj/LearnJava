package java_oops;
class Empee{
	
	int empid;
	String name;
	static String company = "Accenture";
	
	Empee(int empid, String name){
		
		this.empid = empid;
		this.name = name;
	}
	
	void display() {
		
		System.out.println("The empid " +empid + " belongs to " +name + " at Accenture");
	}
}
public class code42_staticvariable {

	public static void main(String[] args) {
		
		Empee e = new Empee(103, "Sritaj");
		Empee e1 = new Empee(104, "Lipan");
		e.display();
		e1.display();
	}
}
