package com.vg.connectordb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connector {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static String url;
	private static String user;
	private static String password;
	
	public Connector(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public Connection connect() throws SQLException, ClassNotFoundException{
		//Class.forName("org.h2.Driver");
		con = DriverManager.getConnection(url,user, password);
		return con;
	}
	
	public Statement state() throws ClassNotFoundException, SQLException{
		return stmt = connect().createStatement();
	}
	
	public ResultSet result(String query) throws ClassNotFoundException, SQLException{
		return rs = state().executeQuery(query);
		
	}
	
	
	
	
}
