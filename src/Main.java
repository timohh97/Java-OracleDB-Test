import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) throws SQLException   {
		
                    insertRowQuery();
		        
		    }
	
	
	
	public static Connection connectWithDatabase() throws SQLException {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
         
        String password = JOptionPane.showInputDialog("Enter password:");

      
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connected successful.");	
			
		return connection;
	}
	
	
	public static void insertRowQuery() throws SQLException {
		
		Connection connection = connectWithDatabase();
		
		String query = "INSERT INTO personen (name,vorname,email,age)"
				+"VALUES ('Schessl','Timo','timo.schessl@gmx.de','22')";
        
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(query);
        
        if(rowsAffected >0)
        {
        	System.out.print("Row has been inserted successful!");
        }
        else
        {
        	System.out.print("Error!");
        }
   
        connection.close();
	}
		

	}


