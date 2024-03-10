package oopWithNLayeredApp4.core.log;

public class MailLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Mail ile Loglandı " + data);
	}

}
