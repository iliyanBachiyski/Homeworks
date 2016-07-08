
public class Student extends Person {
	
	double score;
	
	Student(String name , int age , boolean isMale , double score){
		super(name, age, isMale);
		setScore(score);
	}
	public void setScore(double score){
		if(score>=2 && score<=6){
			this.score = score;
		}
	}

	@Override
	void showInfo() {
		System.out.println("Student info:");
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Score: " + this.score);
	}
		
}
