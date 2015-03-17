package test;

public class Variables {
	
	//print to console (true/false)?
	private static final boolean testMode = true;
	//which database to use ("local"/"kraka")?
	private static final String database = "local";
	
	//variables
	private static String DBurl;
	
	//test DB variables
	private static final String testDBDriver = "jdbc:sqlserver://localhost:1433";
	private static final String testDBName = ";databaseName=workshop";
	private static final String testDBUserName = ";user=sa";
	private static final String testDBPassword = ";password=secret";
	
	//kraka DB variables
	private static final String krakaDBDriver = "jdbc:sqlserver://kraka.ucn.dk:1433";
	private static final String krakaDBName = ";databaseName=dmai0914_2Sem_5";
	private static final String krakaDBUserName = ";user=dmai0914_2Sem_5";
	private static final String krakaDBPassword = ";password=IsAllowed";
	
	//constructor
	private Variables() {
		
	}
	
	public static boolean getTestMode() {
		return testMode;
	}
	
	public static String getDBurl() {
		if (database.equals("local")) {
			DBurl = testDBDriver + testDBName + testDBUserName + testDBPassword;
		} else if (database.equals("kraka")) {
			DBurl = krakaDBDriver + krakaDBName + krakaDBUserName + krakaDBPassword;
		} else {
			throw new NullPointerException("Incorrect database name in file Variables.java");
		}
		return DBurl;
	}
}