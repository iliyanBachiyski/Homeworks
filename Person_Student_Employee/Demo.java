
public class Demo {

	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		persons[0] = new Person("Ivan", 20, true);
		persons[1] = new Person("Penka" , 17 , false);
		persons[2] = new Student("Georgi", 19, true, 4);
		persons[3] = new Student("Ivanka", 21, false, 3.74);
		persons[4] = new Employee("Petur", 35, true, 50);
		persons[5] = new Employee("Katq", 28, false, 45);
		for (int i = 0; i < persons.length; i++) {
			if(persons[i]==null){
				break;
			}
			persons[i].showInfo();
		}
		
		for (int i = 0; i < persons.length; i++) {
			if(persons[i]==null){
				break;
			}
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i];
				System.out.println("The sum for " + e.getName() + " is " + e.calculateOverTime(2));
			}
		}
		System.out.println("After Over Time: ");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i];
				e.showInfo();
			}
		}
		
	}

}
