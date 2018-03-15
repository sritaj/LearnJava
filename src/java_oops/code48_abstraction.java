package java_oops;
import java.util.Date;

abstract class Watch{
	
	void showTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	abstract void showWeather();
}

class AndroidWear extends Watch{
	
	void showWeather() {
		System.out.println("The temperature is 34 degree, You can expect the day to be sunny");
	}
}

class AppleWatch extends Watch{
	
	void showWeather() {
		System.out.println("The temperature is 2 degree, You can expect the night to be freezing");
	}
}

class ShowBusiness{
	
	void TimeandWeather(Watch w) {
		
		w.showTime();
		w.showWeather();
	}
}

public class code48_abstraction {
	
	public static void main(String[] args) {
		ShowBusiness d = new ShowBusiness();
		d.TimeandWeather(new AppleWatch());
	}
	

}
