
public class Car {
	
	private String model;
	private int maxSpeed;
	private int currentSpeed = 0;
	private String color;
	private int currentGear = 1;
	private Person owner;
	private int maxGear = 5;
	private int price;
	private boolean isSportCar;
	
	Car(String model , String color , boolean isSportCar){
		setModel(model);
		setColor(color);
		this.isSportCar = isSportCar;
		if(this.isSportCar){
			this.maxGear = 6;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner){
		if(owner!=null){
			this.owner = owner;
		}
	}

	private void setModel(String model) {
		if(model!=null && !(model.isEmpty()) ){
			this.model = model;
		}
	}

	private void setColor(String color) {
		if(color!=null && !(color.isEmpty()) ){
			this.color = color;
		}
	}

	void accelerate(){
		
		if(this.currentSpeed==this.maxSpeed){
			System.out.println("You Can't Accelerate More!");
			return;
		}
		if(this.currentSpeed<this.maxSpeed){
			this.currentSpeed+=10;
		}
	}
	
	void changeGearUp(){
		
		if(this.currentGear==this.maxGear){
			System.out.println("You Can't Change Gear Up!");
			return;
		}
		if(this.currentGear<this.maxGear){
			this.currentGear++;
		}
	}
	
	void changeGearDown(){
		
		if(this.currentGear==1){
			System.out.println("You Can't Change Gear Down!");
			return;
		}
		this.currentGear--;
	}
	
	void changeGear(int gear){
		if(gear>this.maxGear){
			System.out.println("You Can't Change Gear!");
			return;
		}
		if(gear==this.maxGear){
			System.out.println("You Are Of This Gear!");
			return;
		}
		System.out.println("You Changed in " + gear + " Gear!");
		this.currentGear = gear;
	}
	
	void changeColor(String color){
		if(color.equals(this.color)){
			System.out.println("Your color is same, and no need to change!");
			return;
		}
		if(color!=null && !(color.isEmpty()) ){
			this.color = color;
		}
	}
	
	boolean isMoreExpensive(Car car){
		if(this.price>car.price){
			return true;
		}
		return false;
	}
	
	double calculateCarPriceForScrap(double metalPrice){
		double coef = 0.2;
		if( this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white") ){
			coef +=0.05;
		}
		if(this.isSportCar){
			coef +=0.05;
		}
		return metalPrice*coef;
	}
	
	void changeOwner(Person newOwner){
		if(this.owner!=newOwner){
			this.owner = newOwner;
			System.out.println("Owner changed!");
			return;
		}
		System.out.println("This car is your!");
	}
	
}
