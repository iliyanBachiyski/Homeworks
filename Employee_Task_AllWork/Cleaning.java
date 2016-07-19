
public class Cleaning extends Task {

	Cleaning(String name, int workingHour){
		if(name!=null && !(name.isEmpty()) ){
			this.setName(name);
		}
		if(workingHour>0){
			this.setWorkingHours(workingHour);
		}
	}
}
