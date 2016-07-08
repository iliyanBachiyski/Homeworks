package Student;

public class Student {
	String name;
	String subject;
	double grade;
	char yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student(){
		this.grade = 4;
		this.yearInCollege = '1';
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name , String subject , int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		
		if(this.isDegree==false && this.yearInCollege<4){
			this.yearInCollege++;
		}
		
		if(this.yearInCollege>=4){
			this.isDegree=true;
			System.out.println("Ura");
			return;
		}
	}
	
	double receivScholarship(double min , double amount){
		
		if(this.age<30 && this.grade>=min){
			this.money+=amount;
			System.out.println("The money are changed!");
			return this.money;
		}
		System.out.println("The money are not Changed!");
		return this.money;
	}
	
}
