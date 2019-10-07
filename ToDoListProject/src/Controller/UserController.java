
package Controller;

import java.sql.*;

import Common.ConnectDB;

public class UserController {
	
	private Connection  connect;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public boolean  loginMethod(String userName, String password)throws Exception {

		boolean returnVal=false;
		try {
			ConnectDB db = new ConnectDB();
			returnVal=db.login(userName, password);
			
		} catch (Exception e) {
			throw e;
		}
		
		return returnVal;

	}

}
