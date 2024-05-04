import company.beans.Person;
import company.exceptions.InvalidAgeException;
import implementations.EmailMessenger;
import utils.MathUtils;



public class Main {

	public static void main(String[] args) {
		
		
		//zad 1 
		
		/*
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
		} */
		
		
		//Zad 2 
		
		/*
		EmailMessenger em1 = new EmailMessenger();
		em1.sendMessage("Jakiś tekst");   */
		
		
		//zad 3 
		int X = MathUtils.add(5, 6);  // Przez to że metoda jest statyczna można jej użyć mimo że nie powstał żaden obiekt tej klasy
		EmailMessenger em2 = new EmailMessenger();
		em2.sendMessage("" + X);
		
		

	}

}
