
public class CarShop {
	
	Car[] cars;
	static int index = -1;
	CarShop(int capacity){
		this.cars = new Car[capacity];
	}
	
	boolean addCar(Car car){
		
		for (int i = 0; i < cars.length; i++) {
			if(cars[i]==null && car.getOwner()==null){
				this.cars[i] = car;
				System.out.println("Car added!");
				return true;
			}
		}
		return false;
	}
	
	Car getNextCar(){
		index++;
		if(cars[index]!=null){
			return cars[index];
		}
		return null;
	}
	
	void sellNextCar(Person buyer){
		
		if(getNextCar().getOwner()== null){
			if(buyer!=null){
				index--;
				buyer.setOwnCar(getNextCar());
			}
		}
	}
	
	boolean removeCar(Car c){
		if(c.getOwner()!=null){
			for (int i = 0; i < cars.length; i++) {
				if(c.getOwner()==cars[i].getOwner()){
					c.setOwner(null);
					cars[i]=null;
					System.out.println("Removed!");
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i]!=null){
				System.out.println( (i+1) + "." + cars[i].getModel());
			}
		}
		return "Done";
		
	}
}
