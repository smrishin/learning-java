public class User {
	private String name;
	private int age;
	private String email;

	public User(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void printUserDetails() {
		System.out.println("=.=.=.=.= User Details =.=.=.=.=");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Email: " + this.email);
	}
}