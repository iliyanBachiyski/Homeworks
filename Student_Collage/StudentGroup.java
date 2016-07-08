package Student;

public class StudentGroup {
	
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	void addStudent(Student s){
		if(s.subject.equalsIgnoreCase(groupSubject) && this.freePlaces!=0){
			for (int i = 0; i < students.length; i++) {
				if(students[i]==null){
					students[i]=s;
					freePlaces--;
					break;
				}
			}
		}
	}
	
	void emptyGroup(){
		students = new Student[5];
		this.freePlaces = 5;
	}
	
	String theBestStudent(){
		int index = 0;
		for (int i = 1; i < this.students.length-1; i++) {
			if(this.students[i]!=null){
				if(this.students[i].grade>this.students[i-1].grade){
					index = i;
				}
			}
		}
		return students[index].name;
	}
	
	void printStudentsInGroup(){
		for (int i = 0; i < this.students.length; i++) {
			if(students[i]!=null){
				System.out.print(this.students[i].name + ";");
				System.out.print(this.students[i].age + ";");
				System.out.print(this.students[i].subject + ";");
				System.out.print(this.students[i].yearInCollege + ";");
				System.out.print(this.students[i].grade + ";");
				System.out.print(this.students[i].money + ";");
				System.out.println();
			}
		}
	}

}
