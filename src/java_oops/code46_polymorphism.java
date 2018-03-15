package java_oops;
class Google{
	
	void Search(String s) {
		
		System.out.println("Search Google for " +s);
	}
}

class GoogleWeb extends Google{
	
	void Search (String s) {
		
		System.out.println("Search Google Web for " +s);
	}
}

class GoogleImage extends Google{
	
	void Search (String s) {
		
		System.out.println("Search Google Image for " +s);
	}
}

class GoogleNews extends Google{
	
	void Search (String s) {
		
		System.out.println("Search Google News for " +s);
	}
}


public class code46_polymorphism {
	
	public static void main(String[] args) {
		
		Google g = new Google();
		GoogleWeb w = new GoogleWeb();
		GoogleImage i = new GoogleImage();
		GoogleNews n = new GoogleNews();
		
		g.Search("Sikuli");
		w.Search("Sikuli");
		i.Search("Sikuli");
		n.Search("Sikuli");
	}

}
