
public abstract class Task {
	
	private String name;
	private int workingHours;
	
	public String getName() {
		return name;
	}
	public int getWorkingHours() {
		return workingHours;
	}

	protected void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}

	protected void setWorkingHours(int workingHours) {
		if(workingHours>=0){
			this.workingHours = workingHours;
		}
	}
	
}
