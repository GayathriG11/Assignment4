package assignment.week4.day1;

public class JavaConnection extends MySqlConnection {
	
	

	public static void main(String[] args) {
		
		
	JavaConnection java = new JavaConnection();
	
	java.connect();
	java.disconnect();
	java.executeUpdate();
	java.executeQuery();
	

	}

	@Override
	public void connect() {
		
		System.out.println("connected successfully");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnected successfully");
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Execution updated successfully");
	}

}
