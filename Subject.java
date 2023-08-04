package todayTask;

import java.util.Objects;

public class Subject {
	private String subjectCode;
	private String subjectName;
	
	public Subject(String subjectCode, String subjectName) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(subjectCode, subjectName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(subjectCode, other.subjectCode) && Objects.equals(subjectName, other.subjectName);
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + "]";
	}
	
 
}
