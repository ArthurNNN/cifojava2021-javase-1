package personExample;

public class TestPerson {
	public static void executePerson() {
		createAndTestObjectsPerson();
	}

	public static void createAndTestObjectsPerson() {
		
		Person sergi = new Person();
		
		Person isa = new Person("Isabel", 18);
		
		Person toni = new Person("Antonio", 30, 80, 180, 2000);
	}

}