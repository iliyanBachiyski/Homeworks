package Homework2;

public class Task {
	
	private String name;
	private double workingHours;
	
	Task(String name , double workingHours){
		setName(name);
		setWorkingHours(workingHours);
	}
	
	public String getName() {
		return name;
	}
	public double getWorkingHours() {
		return workingHours;
	}

	private void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}

	protected void setWorkingHours(double workingHours) {
		if(workingHours>=0){
			this.workingHours = workingHours;
		}
	}
	
}
