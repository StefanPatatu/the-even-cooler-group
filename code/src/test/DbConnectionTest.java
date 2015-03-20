package test;

import static org.junit.Assert.*;
import org.junit.Test;

import db.DbConnection;

public class DbConnectionTest {

	@Test
	public void test() {
		DbConnection dbCon = DbConnection.getInstance();
		if(dbCon != null)
		{
			System.out.println("Connection established");
		}
		else{
		    fail("FAILUREEEE!!!!!");
		}
	}

}
