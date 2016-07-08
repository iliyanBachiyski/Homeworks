package Computer;

public class Computer_Edit {
	
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	Computer_Edit(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer_Edit(int year, double price, int hardDiskMemory , int freeMemory){
		this();
		this.year = year;
		this.price= price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer_Edit(int year, double price, boolean isNotebook , int hardDiskMemory , int freeMemory, String operationSysyem){
		this.year = year;
		this.price= price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSysyem;
	}
	
	int comparePrice(Computer_Edit c ){
		if(this.price == c.price ){
			return 0;
		}
		if(this.price>c.price){
			return -1;
		}
		return 1;
	}
	
	
}
