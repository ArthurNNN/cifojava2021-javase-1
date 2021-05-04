package personExample;

public class Person {
//fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	protected double basicSalary;

//Constructor from Person Class
	public Person(String name, int age, int weigth, int heigth, double basicSalary) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
	}

//Methods from Person Class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
				+ basicSalary + "]";
	}

//Getters and Setters and toString
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}