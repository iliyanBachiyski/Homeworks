public class Demo {
	
	public static void main(String[] args) {
		
		AllWork allwork = new AllWork();
		
		Task masonry = new Masonry("Masonry", 10);
		Task rendering = new Rendering("Rendering", 12);
		Task cleaning = new Cleaning("Cleaning", 8);
		allwork.addTask(cleaning);
		allwork.addTask(rendering);
		allwork.addTask(masonry);
		
		Employee e1 = new Employee("Ivan");
		Employee e2 = new Employee("Petur");
		Employee e3 = new Employee("Georgi");
		Employee e4 = new Employee("Naiden");
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println(allwork.getNextTask());
//		System.out.println("Current Unassigned Task is: " + (allwork.currentUnassignedTask+1));
//		e1.setAllWork(allwork);
//		e1.work();
//		e1.work();
//		System.out.println(allwork.tasks[0].getWorkingHours());
//		e2.setAllWork(allwork);
//		e2.work();
//		e3.setAllWork(allwork);
//		e3.work();
//		System.out.println(allwork.tasks[0].getWorkingHours());
//		System.out.println(allwork.tasks[1].getWorkingHours());
//		System.out.println(allwork.tasks[2].getWorkingHours());
//								
		e1.setAllWork(allwork);
		e2.setAllWork(allwork);
		e3.setAllWork(allwork);
		while(true){
			if(e1.getHoursLeft() == 0 && e2.getHoursLeft() == 0 && e3.getHoursLeft() == 0){
				if(allwork.isAllWorkDone()){
					System.out.println("All tasks are finished!");
					break;
				}
				e1.startWorkingDay();
				e2.startWorkingDay();
				e3.startWorkingDay();
				Employee.day++;
			}
			if(allwork.isAllWorkDone()){
				System.out.println("All tasks are finished!");
				break;
			}
			System.out.println("Day " + Employee.day + " started!");
			if(!allwork.isAllWorkDone()){
				e1.work();
			}
			if(!allwork.isAllWorkDone()){
				e2.work();
			}
			if(!allwork.isAllWorkDone()){
				e3.work();
			}
		}
		

	}
}
