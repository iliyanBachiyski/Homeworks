import java.util.Scanner;


public class AllWork{
	Scanner sc = new Scanner(System.in);
	Task[] tasks;
	int freePlacesForTasks;
	int currentUnassignedTask;

	AllWork(){
		this.tasks = new Task[10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = -1;
	}
	
	void addTask(Task newTask){
		if(newTask!=null){
			for (int i = 0; i < tasks.length; i++) {
				if(tasks[i]==null){
						tasks[i] = newTask;
						System.out.println("Task Added!");
						return;
					
				}
			}
			System.out.println("No more free spaces!");
		}
	}
	
	Task getNextTask(){
		
		if(currentUnassignedTask >= (tasks.length-1) ){
			System.out.print("No more tasks!");
			return null;
		}
		currentUnassignedTask++;
		return tasks[currentUnassignedTask];
	}
	
	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i]==null){
				break;
			}
				if(tasks[i].getWorkingHours()!=0){
					return false;
				}
		}
		return true;
	}
}
