public class Demo {
	
	public static void main(String[] args) {
		
		AllWork allwork = new AllWork();
		for (int i = 0; i < 10; i++) {
			allwork.addTask();
		}
		
		Employee e1 = new Employee("Ivan");
		Employee e2 = new Employee("Petur");
		Employee e3 = new Employee("Georgi");
		Employee e4 = new Employee("Naiden");
		while(true){
			if(e1.getHoursLeft() == 0 && e2.getHoursLeft() == 0 && e3.getHoursLeft() == 0 && e4.getHoursLeft() == 0){
				break;
			}
			e1.work();
			e2.work();
			e3.work();
			e4.work();
		}
		

	}
}
