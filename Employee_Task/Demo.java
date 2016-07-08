package Homework2;

public class Demo {
	public static void main(String[] args) {
		Task t1 = new Task("Zidane", 10);
		Employee e1 = new Employee("Ivan" , 12);
		e1.setCurentTask(t1);
		e1.showReport();
		System.out.println("---------------------");
		e1.work();
		System.out.println("---------------------");
		e1.showReport();
		e1.work();
		System.out.println("---------------------");
		Task t2 = new Task("Stroene" , 3);
		e1.setCurentTask(t2);
		e1.showReport();
		System.out.println("---------------------");
		e1.work();
		e1.showReport();
		Employee e2 = new Employee("Gosho" , 12);
		System.out.println("---------------------");
		e2.setCurentTask(t1);
		e2.work();
		e2.showReport();
		System.out.println("---------------------");
		e2.setCurentTask(t2);
		e2.work();
		e2.showReport();
		

	}
}
