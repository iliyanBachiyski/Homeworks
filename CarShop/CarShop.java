
public class CarShop {
	
	Car[] cars;
	int index = -1;
	CarShop(int capacity){
		this.cars = new Car[capacity];
	}
	
	boolean addCar(Car car){
		
		for (int i = 0; i < cars.length; i++) {
			if(cars[i]==null){
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
				buyer.setOwnCar(getNextCar());
			}
		}
		
		
	}
}
