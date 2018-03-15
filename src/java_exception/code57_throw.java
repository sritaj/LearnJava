package java_exception;

class MinAge extends Exception{
	
	public String toString() {
		return "Sorry, You are not qualified to apply for Driving License";
	}
	
}

class MaxAge extends Exception{
	
	public String toString() {
		return "Sorry, for age greater than 35 you have to apply under Special Quota";
	}
}

class DrivingLicense {
	
	void apply(int age) throws MinAge, MaxAge {
		
		if (age>=21 && age<=35) {
			
			System.out.println("Eligible to Apply for Driving License");
		} else if (age<21){
			
			throw new MinAge();
			
		} else if (age>35) {
			
			throw new MaxAge();
		}
	}
}

public class code57_throw {

	public static void main(String[] args) {
		
		DrivingLicense d = new DrivingLicense();
		
		try {
			d.apply(40);
			System.out.println("Driving License applied");
		}catch (MinAge m) {
			System.out.println(m.toString());
		}catch (MaxAge m) {
			System.out.println(m.toString());
		}
		
	}
}

