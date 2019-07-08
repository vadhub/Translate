package com.vg.translate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.vg.connectordb.Connector;

public class Traslater {
	private HashMap<String, String> st = new HashMap<String, String>();
	private static final String url= "jdbc:mysql://localhost:3306/dictionary";
	private static final String user= "person";
	private static final String password= "1234";
	
	String sql = "SELECT en, ru FROM dictionary";
	
	public void translateToRus(String englis) throws SQLException, ClassNotFoundException{
		Connection con = DriverManager.getConnection(url,user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
	
		int eng = rs.findColumn("en");
		int rus = rs.findColumn("ru");
		
		while(rs.next()){
			String en = rs.getString(eng);
			String ru = rs.getString(rus);
			
			st.put(en, ru);
		}
		
		String[] subStr;
		String delimeter = " ";
		subStr = englis.split(delimeter);
		
		int i = 0;
		
		for(String arr: subStr){
				for (Map.Entry<String, String> entry : st.entrySet()) {
					String str = entry.getKey();
					if(str.equals(arr)){
						System.out.print(entry.getValue()+" ");
					}					
				}
		
			}
		}
	public HashMap<String, String> getSt() {
		return st;
	}
	public void setSt(HashMap<String, String> st) {
		this.st = st;
	}
}
