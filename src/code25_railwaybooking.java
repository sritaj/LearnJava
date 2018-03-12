
public class code25_railwaybooking {
	
	int tickets_available = 678;
	
	void bookTicket(int booking) {
		
		if (booking <= tickets_available) {
			
			tickets_available = tickets_available - booking;
			
			System.out.println("User booked " +booking + " tickets");
			
			System.out.println("Tickets available " +tickets_available);
		} else {
			
			System.out.println("Tickets are not available, please check with fewer quantities");
		}
		
	}
	
	void cancelTicket(int cancel) {
		
		if (cancel <= tickets_available) {
			
			tickets_available = tickets_available + cancel;
			System.out.println(+cancel + " Tickets are cancelled");
			System.out.println(+tickets_available + " Tickets are available");
		} else {
			
			System.out.println("Wrong entry");
		}
	}

	public static void main(String[] args) {
		
		code25_railwaybooking rb = new code25_railwaybooking();
		rb.bookTicket(300);
		rb.cancelTicket(100);
	}
}
