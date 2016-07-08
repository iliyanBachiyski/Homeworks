package Computer;

public class Demo {

	public static void main(String[] args) {
		
		Computer_Edit c1 = new Computer_Edit(2016, 630, 500, 480);
		Computer_Edit c2 = new Computer_Edit(2015, 630, 800, 780);
		
		System.out.println(c1.comparePrice(c2));

	}

}
