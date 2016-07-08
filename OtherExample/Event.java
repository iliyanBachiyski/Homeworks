public class Event {
	
	String place;
	String date;
	String startHour;
	int numberOfTickets;
	double priceOfTicket;
	
	
	boolean sellTicket(int num){
		if(numberOfTickets==0){
			System.out.println("Tickets is over!");
			return false;
		}
		if(num>numberOfTickets){
			System.out.println("Don't have" + num + " tickets!");
			System.out.println("We have only " + numberOfTickets);
			return false;
		}
		numberOfTickets = numberOfTickets-num;
		return true;
	}
}