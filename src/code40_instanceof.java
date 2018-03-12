class  Employee{
	
}

class BackendDeveloper extends Employee{
	
}

class UIDeveloper extends Employee{
	
}

class Tester extends Employee{
	
}

class DBAdmin extends Employee{
	
}

class Display{
	
	void Convert(Employee e) {
		
		if (e instanceof BackendDeveloper) {
			
			System.out.println("Employee is assigned the BackendDeveloper role ");
		}
		else if (e instanceof UIDeveloper) {
	
			System.out.println("Employee is assigned the UIDeveloper role");
		}
		else if (e instanceof Tester) {
			
			System.out.println("Employee is assigned the Tester role");
		} else if (e instanceof DBAdmin) {
			
			System.out.println("Employee is assigned the DBAdmin role");
		}
	}
}
public class code40_instanceof {
	public static void main(String[] args) {
		Display d = new Display();
		d.Convert(new UIDeveloper());
	}

}
