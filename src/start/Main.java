package start;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	protected static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) throws Exception {
		DatabaseConnection.post();
	}
}
