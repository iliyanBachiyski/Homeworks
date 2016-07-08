package PhoneCall;

public class Demo {
	
	public static void main(String[] args) {
			
		GSM phone1 = new GSM("Samsung");
		GSM phone2 = new GSM("Nokia");
		phone1.insertSimCard("0886953569");
		phone2.insertSimCard("0897256397");
		GSM phone3 = new GSM("Huawei");
		phone3.insertSimCard("0897256355");
		phone2.call(phone1, 1.37);
		System.out.println("Your sum for call is: " + String.format( "%.2f", phone2.getSumForCall() ));
		phone1.call(phone2, 6);
		System.out.println("Your sum for call is: " + String.format( "%.2f", phone1.getSumForCall() ));
		phone3.call(phone1, 5);
		phone2.call(phone3, 8);
		System.out.println("Samsung:");
		phone1.printInfoForTheLastIncomingCall();
		phone1.printInfoForTheLastOutgoingCall();
		System.out.println("Nokia");
		phone2.printInfoForTheLastIncomingCall();
		phone2.printInfoForTheLastOutgoingCall();
		System.out.println("Huawei:");
		phone3.printInfoForTheLastIncomingCall();
		phone3.printInfoForTheLastOutgoingCall();

		
	}
}
