package br.com.caelum.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("org.postgresql.Drive//localhost/fj21",
					"root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
