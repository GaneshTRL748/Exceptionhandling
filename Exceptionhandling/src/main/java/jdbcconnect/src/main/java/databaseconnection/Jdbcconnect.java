package databaseconnection;
import java.sql.*;
import java.util.logging.Logger;
class Singleton{
	Connection con;
	private String pass="ganeshS@123";
	private static Singleton  a1;
	Logger logger= Logger.getLogger("log4j-api-2.19.0.jar");
	private Singleton()
	{
		logger.info("Instance created successfully");
	}
	public static Singleton getobject()
	{
		if(a1==null)
		{
			a1=new Singleton();
		}
		return a1;
	}
	void connect2db() throws ClassNotFoundException
	{
		try {
		   Class.forName("com.mysql.jdbc.Driver"); 
 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root",pass);
 		   logger.info("Database Connected Successfully");
 	   }
 	   catch(SQLException e)
 	   {
 		   logger.info("oops something wentwrong"+e);
 	   }
	}
	void closedbconnection() 
	{
		try {
			con.close();
		}
		catch(SQLException e)
		{
			logger.info("Oops something went wrong"+e);
		}
		finally{
	      	logger.info("Databaseconnection CLosed Successfully");
		}
	}
}
public class Jdbcconnect {

	public static void main(String[] args) throws ClassNotFoundException
	{
		   Singleton a2=Singleton.getobject();
           a2.connect2db();
           a2.closedbconnection();
	}

}
