
public class Person {
	
	private String name;
	private int age;
	final private boolean isMale;

	Person(String name , int age , boolean isMale){
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}
	
	public boolean getIsMale(){
		return isMale;
	}
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setName(String name) {
		if( !(name.isEmpty()) && name!=null ){
			this.name = name;
		}
	}


	public void setAge(int age) {
		if(age>=0){
			this.age = age;
		}
	}


	void showInfo(){
		System.out.println("Person Info:");
		System.out.println("Name: " + this.name );
		System.out.println("Age : " + this.age);
		System.out.println("Sex: " + ( (this.isMale)?  "Male" : "Female") );
	}
	
}
