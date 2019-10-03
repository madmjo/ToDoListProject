import java.sql.*;

public class Main {

	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ConnectDB db = new ConnectDB();
		db.connectToDB();
		 db.readUsers();
		 db.close();

	}

}
