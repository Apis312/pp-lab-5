package implementations;
import interfaces.Messenger;

public class EmailMessenger implements Messenger {
	
	public void sendMessage(String message) {
		System.out.println("Wiadomość:\n" +  message);
	}

}
