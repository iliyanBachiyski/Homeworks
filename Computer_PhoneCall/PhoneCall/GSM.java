package PhoneCall;

public class GSM {
	
	final String model;
	boolean hasSimCard = false;
	private String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutcomingCall;
	
	GSM(String model){
		this.model = model;
	}
	
	void insertSimCard(String simMobileNumber){
		
		if( simMobileNumber.length() == 10 && simMobileNumber.charAt(0)== '0' && simMobileNumber.charAt(1)=='8'){
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
			System.out.println("Sim card is inserted!");
			return;
		}
		System.out.println("Invalid Number!!!");
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}
	
	void call(GSM receiver , double duration){
		if(duration<=0){
			System.out.println("Invalid Call");
			return;
		}
		
		if(this.simMobileNumber.equals(receiver.simMobileNumber)){
			System.out.println("Incorect!");
			return;
		}
		
		if( (this.hasSimCard && receiver.hasSimCard)==false ){
			System.out.println("Please insert sim card before call!!");
			return;
		}
		
		Call c = new Call();
		c.caller = this;
		c.duration = duration;
		this.lastOutcomingCall = c;
		c.receiver = receiver;
		receiver.lastIncomingCall = c;
		this.outgoingCallsDuration += duration;
	}
	
	public double getSumForCall(){
		if(this.outgoingCallsDuration==0){
			System.out.println("You dont have outgoing calls!");
		}
		return  outgoingCallsDuration*lastOutcomingCall.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutcomingCall.receiver==null){
			System.out.println(this.model + " dont have outgoing calls");
			return;
		}
		System.out.println("The last outgoing call is to : " + this.lastOutcomingCall.receiver.model);
	}
		
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall.caller==null){
			System.out.println(this.model + " dont have incoming calls!");
			return;
		}
		System.out.println("The last Incoming call is from : " + this.lastIncomingCall.caller.model);
		}
	
	
	
}
