package db;

import java.sql.*;
import test.Variables;

public class DbConnection {
	
	//project variables
	private static final boolean testMode = Variables.getTestMode();
	private static final String DBurl = Variables.getDBurl();
	
	private DatabaseMetaData dma;
    private static Connection con; //an instance of the class is generated
    private static DbConnection instance = null;

    //the constructor is private to ensure that only one object of this class is created
    private DbConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            if (testMode) {
            	System.out.println("Load of class ok");
            } 
        } catch(Exception e) {
        	if (testMode) {
        		System.out.println("Can not find the driver");
        	    System.out.println(e.getMessage());
        	}
        }
        //connect to the database
        try {
            con = DriverManager.getConnection(DBurl);
            con.setAutoCommit(true); //set autocommit
            dma = con.getMetaData(); //get meta data
            if (testMode) {
            	System.out.println("Connection to " + dma.getURL());
            	System.out.println("Driver " + dma.getDriverName());
            	System.out.println("Database product name " + dma.getDatabaseProductName());
            }
        } catch(Exception e) {
        	if (testMode) {
        		System.out.println("Problems with the connection to the database");
        		System.out.println(e.getMessage());
        		System.out.println(DBurl);
        	}
        }
    }
    public static void closeConnection() {
       	try {
            con.close();
            if (testMode) {
            	System.out.println("The connection is closed");
            }
        } catch(Exception e) {
        	if (testMode) {
        		System.out.println("Error trying to close the database " +  e.getMessage());
        	}
        }
    }
    public  Connection getDBcon() {
       return con;
    }
    //this method is used to get the instance of the connection
    public static DbConnection getInstance() {
        if (instance == null) {
        	instance = new DbConnection();
        }
        return instance;
    }
    public static void startTransaction() {
    	try {
    		con.setAutoCommit(false);
        } catch(Exception e) {
        	if (testMode) {
        		System.out.println("Failure to start transaction");
        		System.out.println(e.getMessage());
        	}
        }
    }
    public static void commitTransaction() {
    	try {
    		con.setAutoCommit(true);
        }
    	catch(Exception e) {
    		if (testMode) {
    			System.out.println("Failure to commit transaction");
    			System.out.println(e.getMessage());
    		}
    	}
    }
    public static void rollbackTransaction() {
    	try {
    		con.rollback();
    		con.setAutoCommit(true);
        } catch(Exception e) {
        	if (testMode) {
        		System.out.println("Failure to rollback transaction");
        		System.out.println(e.getMessage());
        	}
        }
    }
}