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
	
	void addTask(){
		
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i]==null){
				System.out.println("Insert Task Name: ");
				String name = sc.nextLine();
				System.out.println("Insert Working Hour: ");
				int workingHours = sc.nextInt();
				tasks[i] = new Task(name, workingHours);
				System.out.println("Task Added!");
				return;
			}
		}
	}
	
	Task getNextTask(){
		if(currentUnassignedTask == (tasks.length-1) ){
			System.out.println("No more tasks!");
			return null;
		}
		this.currentUnassignedTask++;
		return tasks[currentUnassignedTask];
	}
	
	void isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i].getWorkingHours()!=0){
				System.out.println("You have unfinished task!");
				return;
			}
		}
		System.out.println("All tasks are finished!");
	}
}
