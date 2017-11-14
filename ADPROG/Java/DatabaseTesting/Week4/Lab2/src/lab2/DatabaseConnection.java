package lab2;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author up826133
 */
public class DatabaseConnection {
    private Scanner myScanner = new Scanner(System.in);
    public DatabaseConnection(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Here though");
        Connection c = DriverManager.getConnection("jdbc:mysql://35.189.230.12:22/up826133", "up826133@localhost", getInput("Enter the password: "));
            System.out.println("HERE");
        Statement s = c.createStatement();
        s.executeQuery("create table Apple("
                + "tableId int primary key"
                + ")");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public String getInput(String text){
        System.out.println(text);
        text = myScanner.nextLine();
        return text;
    }
}
