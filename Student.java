package todayTask;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String name;
	private int studentId;
	private Subject[]subjects;
	
	public Student(String name, int studentId, Subject[] subjects) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.subjects = subjects;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(subjects);
		result = prime * result + Objects.hash(name, studentId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentId == other.studentId
				&& Arrays.equals(subjects, other.subjects);
	}









	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", subjects=" + Arrays.toString(subjects) + "]";
	}

	public static void main(String[] args) {
		Subject mathSubject = new Subject("MATH101", "Mathematics");
        Subject engSubject = new Subject("ENG101", "English");
        Subject physicsSubject = new Subject("PHY101", "Physics");

        Student student1 = new Student("John Doe", 1,new Subject[]{mathSubject, engSubject});
        Student student2 = new Student("Jane Smith",1, new Subject[]{engSubject, physicsSubject});
        Student student3 = new Student("John Doe", 1,new Subject[]{mathSubject, engSubject}); // Another student with the same ID as student1

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2)); // Should be false
        System.out.println("Are student1 and student3 equal? " + student1.equals(student3)); // Should be true
    

	}

}
