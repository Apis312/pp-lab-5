package company.beans;
import company.exceptions.InvalidAgeException;

public class Person {
	private String name;
	private int age;
	
	public Person(String n, int a) throws InvalidAgeException{
		System.out.println("Konstruktor klasy person");
		
		setName(n);
		setAge(a);
		
	}
	
	public void setName(String n){this.name = n;}
	public void setAge(int a) throws InvalidAgeException {
		System.out.println("jestem seterem");
		if (a < 0 || a > 125) {
			throw new InvalidAgeException("Podano niepoprawny wiek");
		}else {
		this.age = a;}}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	

}
