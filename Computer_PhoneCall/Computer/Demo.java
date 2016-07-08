package Computer;

public class Demo {

	public static void main(String[] args) {
		
		Computer c1 = new Computer(2014, 560, false, 500, 450, "Windows7");
		Computer c2 = new Computer(2014, 800, true, 950, 900, "Windows8");
		c1.printComputer();
		System.out.println("*************");
		c2.printComputer();
		System.out.println("-----------------");
		c1.useMemory(100);
		c2.changeOperationSystem("Linux");
		c1.printComputer();
		System.out.println("*************");
		c2.printComputer();

	}
}
