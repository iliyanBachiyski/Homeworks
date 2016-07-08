package Student;

public class Collage {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ivan Petrov", "KSI", 19);
		Student s2 = new Student("Georgi Naydenov", "KSI", 20);
		Student s3 = new Student("Petur Ivanov", "FTK", 20);
		Student s4 = new Student("Nayden Georgiev", "ITI" , 21);
		StudentGroup group1 = new StudentGroup("KSI");
		
		group1.addStudent(s1);
		group1.addStudent(s2);
		group1.addStudent(s3);
		group1.addStudent(s4);
		
		group1.printStudentsInGroup();
		group1.students[1].grade++;
		System.out.println("The best student is: " + group1.theBestStudent());
		group1.printStudentsInGroup();
		
		s1.upYear();
		System.out.println(s1.yearInCollege);
		s1.receivScholarship(4.2, 200);
		System.out.println(s1.money);

	}
}
