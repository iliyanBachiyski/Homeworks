
public class Masonry extends Task {
	
	Masonry(String name, int workingHour){
		if(name!=null && !(name.isEmpty()) ){
			this.setName(name);
		}
		if(workingHour>0){
			this.setWorkingHours(workingHour);
		}
	}

}
