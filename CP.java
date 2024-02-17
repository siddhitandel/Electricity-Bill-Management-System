package minipro;

import java.sql.Connection;

import java.sql.DriverManager;

public class CP {

	static Connection con;

	

	public static Connection createC() {

	

		try {

			//load driver

			//Class.forName("com.mysql.jdbc.Driver");

			

			//create the connection

			String user="root";

			String password ="mysql";

			String url="jdbc:mysql://localhost:3306/miniprojectt";

			con=DriverManager.getConnection(url,user,password);

			System.out.println("Connection Successful");

		}

		catch(Exception e) {

			e.printStackTrace();

		}

		return con;

	}

}

