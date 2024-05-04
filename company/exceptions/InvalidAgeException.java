package company.exceptions;

public class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s){
		//konstruktor klasy potomnej
		super(s); //konstruktor wyższej klasy - exception
		
	}
	

}
