package Computer;

public class Computer {

	private int year;
	private double price;
	final boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	Computer(int year,double price,boolean isNotebook,int hardDiskMemory, int freeMemory,String operationSystem){
		if(year>0){
			this.year = year;
		}
		if(price>0){
			this.price = price;
		}
		this.isNotebook = isNotebook;
		if(hardDiskMemory>0){
			this.hardDiskMemory = hardDiskMemory;
		}
		if(freeMemory>0 && freeMemory<=hardDiskMemory){
			this.freeMemory = freeMemory;
		}
		if(operationSystem!=null && !(operationSystem.isEmpty()) ){
			this.operationSystem = operationSystem;
		}
	}
	
	void changeOperationSystem(String newOperationSystem){
		
		if(newOperationSystem != null && !(newOperationSystem.isEmpty()) ){
			this.operationSystem = newOperationSystem;
		}
	}
	
	void useMemory(int takeMemory){
		
		if(takeMemory>freeMemory){
			System.out.println("Not enough free memory!");
			return;
		}
		this.freeMemory-=takeMemory;
	}	
	
	void printComputer(){
		
		System.out.println("Year is: " + this.year );
		System.out.println("Free Memory is: "+ this.freeMemory);
		System.out.println("Hard Disk Memory is: " + this.hardDiskMemory);
		System.out.println("Price is: " + this.price);
		System.out.println("Operation System is: "+ this.operationSystem);
		System.out.println("Notebook? : " + this.isNotebook);
		
	}
}
