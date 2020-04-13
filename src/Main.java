import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args)  {
		

		        String url="jdbc:oracle:thin:@localhost:1521:xe";
		        String username = "system";
                 
		        String password = JOptionPane.showInputDialog("Enter password:");

		        try {
					Connection connection = DriverManager.getConnection(url,username,password);
					
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
					
		
				} catch (SQLException e) {
					System.out.print("Error!");
					e.printStackTrace();
				}
		        
		        

		    }
		

	}


