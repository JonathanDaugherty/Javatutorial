package library;

public class GermanShepherd extends Dog implements IBirthday  {
	
	
	public void birthday() {
		System.out.println("Prev age is " + getAge());
		setAge(getAge() + 1);
		System.out.println("Curr age is " + getAge());
	}
	
	public GermanShepherd(String name, String bark, int age) {
		super(name, bark, age);
	}
	
	public GermanShepherd() {
		super();
	}
	
	
}
