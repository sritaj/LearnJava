interface WebBrowser{
	
	void launch();
	void url(String url);
}

class FirefoxQuantum implements WebBrowser {
	
	public void launch() {
		System.out.println("Launch Firefox Quantum");
	}
	
	public void url(String s) {
		
		System.out.println("Navigate to the URL " +s);
	}
}

class MicrosoftEdge implements WebBrowser {
	
	public void launch() {
		System.out.println("Launch Microsoft Edge");
	}
	
	public void url (String s) {
		System.out.println("Navigate to the URL " +s);
	}
}

class GoogleChrome implements WebBrowser{
	
	public void launch() {
		System.out.println("Launch Google Chrome");
	}
	
	public void url (String s) {
		System.out.println("Navigate to the URL " +s);
	}
}


class BrowserActions {
	
	String s; 
	void action(WebBrowser wb, String s) {
		wb.launch();
		wb.url(s);
	}
}
public class code49_interface {
	
	public static void main(String[] args) {
		
		BrowserActions ba = new BrowserActions();
//		ba.action(new GoogleChrome(), "google.co.in");
//		ba.action(new MicrosoftEdge(), "outlook.com");
		ba.action(new FirefoxQuantum(), "facebook.co.in");
	}

}
