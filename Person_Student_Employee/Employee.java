
public class Employee extends Person {
	
	private double daySalery;
	
	Employee(String name, int age , boolean isMale , double daySalery){
		super(name, age, isMale);
		setDaySalery(daySalery);
	}
	
	public void setDaySalery(double daySalery){
		if(daySalery>0){
			this.daySalery = daySalery;
		}
	}
	
	public double calculateOverTime(double hours){
		if( getAge() >18){
			double hoursSalery = this.daySalery*1.5;
			this.daySalery = daySalery+(hours*hoursSalery);
			return hours*hoursSalery;
			
		}
		return 0;
	}

	@Override
	void showInfo() {
		System.out.println("Employee info:");
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Day salery: " + this.daySalery);
		
	}
}
