package com.ecodation.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionUtil {
	private static Connection connection;
	private static String url="jdbc:mysql://localhost:3306/hastane_otomasyonu";
	private static String user="root";
	private static String password="root";
	
	
	

public static Connection dbConnectionUtilMethod() {
	try {
		if(connection==null || connection.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver başarılı bir şeklde yüklendi.");
			
			connection=DriverManager.getConnection(url, user, password);
			//System.out.println("Database başarılı bir şekilde bağlandıldı.");
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return connection;
}



public static void main(String[] args) {

DbConnectionUtil.dbConnectionUtilMethod();

}

}
