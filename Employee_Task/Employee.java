package Homework2;

public class Employee {
	
	private String name; 
	private Task curentTask;
	private double hoursLeft;
	
	Employee(String name , double hoursLeft) {
		setHoursLeft(hoursLeft);
		setName(name);
	}
		
	public String getName(){
		return name;
	}
	
	public double getHoursLeft(){
		return hoursLeft;
	}

	private void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}

	protected void setCurentTask(Task curentTask) {
		this.curentTask = curentTask;
	}

	private void setHoursLeft(double hoursLeft) {
		if(hoursLeft>=0){
			this.hoursLeft = hoursLeft;
		}
	}
	
	void work(){
		if(getHoursLeft()==0){
			System.out.println("The Employee is no more hours left!");
			return;
		}
		if(curentTask.getWorkingHours()==0){
			System.out.println("The current task is finished!");
			return;
		}
		
		if(curentTask.getWorkingHours()==getHoursLeft()){
			curentTask.setWorkingHours(0);
			setHoursLeft(0);
			System.out.println("The employee no more working hours left and task is finished!");
		}
		if(curentTask.getWorkingHours()>getHoursLeft()){
			curentTask.setWorkingHours((curentTask.getWorkingHours()) - (getHoursLeft()));
			setHoursLeft(0);
			System.out.println("The employee no more working hours left");
			return;
		}
		if(curentTask.getWorkingHours()<getHoursLeft()){
			setHoursLeft((getHoursLeft())-(curentTask.getWorkingHours()));
			curentTask.setWorkingHours(0);
			System.out.println("The curent task is finished!");
			return;
		}
	}
	
	void showReport(){
		System.out.println("Name: " + getName());
		System.out.println("Curent task: " + curentTask.getName());
		System.out.println("Hours left: " + this.getHoursLeft());
		System.out.println("Curent task hours left: " + curentTask.getWorkingHours());
	}
	
	
}
