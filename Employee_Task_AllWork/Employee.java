public class Employee {
	
	private String name; 
	private Task curentTask;
	private int hoursLeft;
	private AllWork allWork;
	
	Employee(String name) {
		setHoursLeft();
		setName(name);
	}
		
	public String getName(){
		return name;
	}
	
	public int getHoursLeft(){
		return hoursLeft;
	}

	private void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}

	protected void setCurentTask() {
		this.curentTask = allWork.getNextTask();
	}

	private void setHoursLeft() {
		this.hoursLeft = 8;
	}
	
	void work(){
		
		if(this.getHoursLeft() ==8){
			setCurentTask();
		}
		
		if(getHoursLeft()==0){
			System.out.println("The Employee is no more hours left!");
			return;
		}
		
		if(curentTask.getWorkingHours()==0){
			System.out.println("The current task is finished!");
			this.curentTask = allWork.getNextTask();
			return;
		}
		
		if(curentTask.getWorkingHours() == getHoursLeft()){
			curentTask.setWorkingHours(0);
			this.hoursLeft = 0;
			System.out.println("The employee no more working hours left and current task is finished!");
			return;
		}
		if(curentTask.getWorkingHours()>getHoursLeft()){
			curentTask.setWorkingHours( (curentTask.getWorkingHours()) - (getHoursLeft() ));
			this.hoursLeft = 0;
			System.out.println("The employee no more working hours left");
			return;
		}
		if(curentTask.getWorkingHours()<getHoursLeft()){
			this.hoursLeft = (getHoursLeft() )-(curentTask.getWorkingHours());
			curentTask.setWorkingHours(0);
			System.out.println("The curent task is finished!");
			this.curentTask = allWork.getNextTask();
			return;
		}
	}
	
	void startWorkingDay(){
		setHoursLeft();
		this.allWork.currentUnassignedTask = -1;
		this.allWork.freePlacesForTasks = 10;
		for (int i = 0; i < this.allWork.tasks.length; i++) {
			if(this.allWork.tasks[i].getWorkingHours() != 0 ){
				return;
			}
		}
		this.allWork.tasks = new Task[10];
	}
	
	void showReport(){
		System.out.println("Name: " + getName());
		System.out.println("Curent task: " + curentTask.getName());
		System.out.println("Hours left: " + this.getHoursLeft());
		System.out.println("Curent task hours left: " + curentTask.getWorkingHours());
	}
	
	
}
