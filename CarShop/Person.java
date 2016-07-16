
public class Person {

		private String name;
		private int age;
		private String personalNumber;
		private boolean isMale;
		private double weight;
		protected Person[] friends;
		private double money;
		private Car ownCar;
		
		Person(){
			this.age = 0 ;
			this.weight = 4;
			friends = new Person[3];
		}
		
		Person(String name , String personalNumber , boolean isMale){
			this();
			if(name!=null && !(name.isEmpty())){
				this.name = name;
			}
			
			if(personalNumber!=null && personalNumber.length()==10){
				this.personalNumber = personalNumber;
			}
			
			this.isMale = isMale;
			
		}
		
		
		public void setOwnCar(Car ownCar) {
			this.ownCar = ownCar;
		}

		
		public Car getOwnCar() {
			return ownCar;
		}
		
		
		public String getName() {
			if(this.name==null){
				return null;
			}
				return name;
		}

		public int getAge() {
			return age;
		}

		void eat(){
			System.out.println(this.name + " eats!");
		}
		
		void walk(){
			System.out.println(this.name + " walks!");
		}
		
		void growUp(){
			age++;
		}
		
		void drinkWater(double liters){
			System.out.println(this.name + " drinks " + liters + " water!");
		}
		
		void buyCar(Car c){
			if(this.money>=c.getPrice()){
				this.ownCar = c;
				if(c.getOwner()!=null){
					c.changeOwner(this);
					return;
				}
				c.setOwner(this);
				return;
			}
			System.out.println("You don't have enough money!");
		}

		double sellCarForScrap(Car c){
			this.ownCar = null;
			System.out.println("Your car go for scrap!");
			return ( this.money = money + c.calculateCarPriceForScrap(2.8) );
		}
}
