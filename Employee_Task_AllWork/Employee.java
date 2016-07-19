public class Employee {
	
	private String name; 
	private Task curentTask;
	private int hoursLeft;
	private AllWork allWork;
	public static int day = 1;
	
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
		if(allWork!=null){
			for (int i = 0; i < allWork.tasks.length; i++) {
				if(allWork.tasks[i]==null){
					System.out.println("There are no tasks!");
					return;
				}
				if(allWork.tasks[i].getWorkingHours()==0){
					continue;
				}
				if(allWork.tasks[i].getWorkingHours()>0){
					this.curentTask = allWork.tasks[i];
					return;
				}
			}
			
		}
		System.out.println("There are no more tasks!");
	}

	private void setHoursLeft() {
		this.hoursLeft = 8;
	}
	
	protected void setAllWork(AllWork allWork){
		if(allWork != null){
			this.allWork = allWork;
		}
	}
	
	AllWork getAllWork(){
		return this.allWork;
	}
	
	void work(){
		
			
			if(this.getHoursLeft() == 8){
				setCurentTask();
			}
			
			if(getHoursLeft() == 0){
				System.out.println("The Employee" + this.getName() + " is no more hours left!");
				return;
			}
			
			if(curentTask.getWorkingHours() == getHoursLeft()){
				
				if(curentTask.getWorkingHours()==0 && getHoursLeft()== 0 ){
					System.out.println("There are no tasks!");
					return;
				}
				System.out.println("The employee " + this.getName() +  " start working on " + this.curentTask.getName());
				curentTask.setWorkingHours(0);
				this.hoursLeft = 0;
				System.out.println("The employee " + this.getName() +  " no more working hours left and current task is finished!");
				return;
			}
			if(curentTask.getWorkingHours()>getHoursLeft()){
				System.out.println("The employee " + this.getName() +  " start on working " + this.curentTask.getName());
				curentTask.setWorkingHours( (curentTask.getWorkingHours()) - (getHoursLeft() ));
				this.hoursLeft = 0;
				System.out.println("The employee " + this.getName() +  " no more working hours left");
				return;
			}
			if(curentTask.getWorkingHours()<getHoursLeft()){
				System.out.println("The employee " + this.getName() +  " start working on " + this.curentTask.getName());
				this.hoursLeft = (getHoursLeft() )-(curentTask.getWorkingHours());
				curentTask.setWorkingHours(0);
				System.out.println("The curent task is finished!");
				this.setCurentTask();
				if(allWork.isAllWorkDone()==false){
					this.work();
				}
				return;
			}
		
		System.out.println("There are no tasks!");
	}
	
	void startWorkingDay(){
		
		setHoursLeft();
		if(this.allWork!=null){
			for (int i = 0; i < this.allWork.tasks.length; i++) {
				if(this.allWork.tasks[i].getWorkingHours() != 0 ){
					return;
				}
			}
			this.allWork.currentUnassignedTask = -1;
			this.allWork.freePlacesForTasks = 10;
			this.allWork.tasks = new Task[10];
			System.out.println("New working Day starts!");
			return;
			
		}
		System.out.println("There are no tasks!");
	}
	
	void showReport(){
		System.out.println("Name: " + getName());
		if(this.curentTask != null){
			System.out.println("Curent task: " + curentTask.getName());
			System.out.println("Curent task hours left: " + curentTask.getWorkingHours());
		}
		System.out.println("Working hours left: " + this.getHoursLeft());
	}
	
	
}
