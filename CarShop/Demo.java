
public class Demo {

	public static void main(String[] args) {
		Car c = new Car("Ford", "yellow", false , 240);
		Person p1 = new Person("Ivan", "9703125463" , true);
		Car c1 = new Car("Mustang", "yellow", false , 240);
		Car c2 = new Car("Opel", "yellow", false , 240);
		Car c3 = new Car("Mazda", "blue", false , 240);
		Person p2 = new Person("Gosho", "9307125463" , true);
		p1.buyCar(c);
		System.out.println(p1.getOwnCar().getModel());
		System.out.println(c.getOwner().getName());
		System.out.println("------------");
		CarShop shop = new CarShop(5);
		shop.addCar(c);
		shop.addCar(c1);
		shop.addCar(c2);
		shop.addCar(c3);
		System.out.println(shop.toString());
		System.out.println("------------");
		shop.sellNextCar(p2);
		System.out.println(p2.getOwnCar().getModel());
		System.out.println(shop.getNextCar().getModel());
		System.out.println("------------");
		c1.changeOwner(p1);
		System.out.println(c1.getOwner().getName());
		System.out.println(c2.getOwner().getName());


	}

}
