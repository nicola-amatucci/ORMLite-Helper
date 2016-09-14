package it.nicolaamatucci.ormlite.util;


import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class DBConnection {

	static String url = "jdbc:mysql://localhost:3306/user";
	static String user = "root";
	static String password = "password";
	
	public static ConnectionSource getConnection() {
		try {
			return new JdbcConnectionSource(url, user, password);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
}

