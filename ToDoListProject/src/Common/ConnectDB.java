package Common;
import java.sql.*;

public class ConnectDB {
	
	
	
	private Connection  connect;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	

	final private String host = "localhost:3306";
	final private String user = "root";
	final private String passwd = "yaze0713";
	final private String database = "sys";
	
	public void connectToDB() throws Exception {
		
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/"
								+ database + "?" + "user=" + user + "&password=" + passwd);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	public void readUsers() throws Exception {
		try {
			statement = connect.createStatement();
			resultSet = statement
					.executeQuery("select * from " + database + ".User");
			while (resultSet.next()) {
				int Id = resultSet.getInt("idUser");
				String name = resultSet.getString("name");
				String userName = resultSet.getString("userName");
				String password = resultSet.getString("password");

				System.out.println(String.format(
						"Id: %d name: %5s  userName: %5s", Id, name, userName,password));
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
	
	public boolean login(String userName,String password) throws Exception{
		boolean state=false;
		
		try {
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/"
					+ database + "?" + "user=" + user + "&password=" + passwd);
		  preparedStatement = connect.prepareStatement("SELECT name,password FROM User"
		  		+ " WHERE userName=? AND password=?");
		  preparedStatement.setString(1, userName);
		  preparedStatement.setString(2, password);
		  ResultSet rs = preparedStatement.executeQuery();
		  if (rs.next()) {
			  state= true;
		  }
		   
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		  
            
		return state;
		
	}
	

}
