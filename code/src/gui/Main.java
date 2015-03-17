package gui;

import java.sql.*;
import test.*;
import db.*;

public class Main {
	
	private static Connection con;

	public static void main(String[] args) {
		
		System.out.println(Variables.getDBurl());
		
		con = DbConnection.getInstance().getDBcon();
		try {
			con.close();
			System.out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
