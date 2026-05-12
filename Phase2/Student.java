public class Student {
	private String name;
	private int age;
	private String major;
	private double gpa = 0;

	public Student (String name, int age, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.age = age;
		this.setGpa(gpa);
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getMajor() {
		return this.major;
	}

	public double getGpa() {
		return this.gpa;
	}

	// setters
	public void setGpa (double newGpa) {
		if (newGpa < 0 || newGpa > 4) {
			System.out.println("!!! GPA cannot be " + newGpa);
			System.out.println("!!! GPA must be 0 - 4, GPA unchanged or set to 0");
		} else {
			this.gpa = newGpa;
		}		
	}

	// methods
	public void printStudentDetails() {
		System.out.println("===== Student Details =====");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Major: " + this.major);
		System.out.println("GPA: " + this.gpa);
	}
}