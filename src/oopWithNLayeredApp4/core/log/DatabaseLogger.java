package oopWithNLayeredApp4.core.log;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Database Loglandı " + data);
	}

}
