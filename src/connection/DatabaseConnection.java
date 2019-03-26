package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

import java.lang.Class;

public class DatabaseConnection {
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/library2";
	private static final String USER = "root";
	private static final String PASS = "root";

	private static DatabaseConnection singleInstance = new DatabaseConnection();

	private DatabaseConnection() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DBURL, USER, PASS);
			System.out.println("Connectionnnnnnnn");
		} catch (SQLException e) {
			LOGGER.log(Level.WARNING, "An error occured while trying to connect to the database");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void post() throws Exception{
        final String var1 = "John";
        final String var2 = "Miller";
        final String var3 = "321231";
        final String var4 = "Miller@yahoo.com";
        final String var5 = "obs";
        final String var6 = "staff";
        final String var7 = "weekly";
        try{
            Connection con = getConnection();
            PreparedStatement posted = (PreparedStatement) con.prepareStatement("INSERT INTO User (idUser, firstName, lastName, password, email, address, typeUser, paymentPlan) VALUES ('6786578', '"+var1+"', '"+var2+"', '"+var3+"', '"+var4+"', '"+var5+"', '"+var6+"', '"+var7+"')");
           
            posted.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("Insert Completed.");
        }
    }

	public static Connection getConnection() {
		return singleInstance.createConnection();
	}

	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.log(Level.WARNING, "An error occured while trying to close the connection");
			}
		}
	}

	public static void close(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				LOGGER.log(Level.WARNING, "An error occured while trying to close the statement");
			}
		}
	}

	public static void close(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				LOGGER.log(Level.WARNING, "An error occured while trying to close the ResultSet");
			}
		}
	}
}
