import company.beans.Person;
import company.exceptions.InvalidAgeException;
import implementations.EmailMessenger;


public class Main {

	public static void main(String[] args) {
		System.out.println("działam");
		
		try {
			Person os1 = new Person("Krzyś", 54);
		} catch (InvalidAgeException e) {
			System.out.println("Wystąpił błąd" + e.getMessage());
		}
		try {
			Person os2 = new Person("Adam", 150);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Wystąpił błąd  " + e.getMessage());
		}
		
		
		//Zad 2 
		EmailMessenger em1 = new EmailMessenger();
		em1.sendMessage("Jakiś tekst");

	}

}
