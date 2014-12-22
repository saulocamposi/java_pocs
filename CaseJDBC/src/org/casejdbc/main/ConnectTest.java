package org.casejdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectTest {

	public static void main(String[] args) {

		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");

		} catch (Exception e) {
			System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
			return;
		}

		try {
			Connection c = DriverManager.getConnection(
					"jdbc:hsqldb:hsql://localhost/", "SA", "");

			Statement statement = c.createStatement();

			ResultSet resultSet = statement
					.executeQuery("SELECT * FROM FIRSTTABLE;");

			while (resultSet.next()) {
				String name = resultSet.getString("name");
				System.out.println(name);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
