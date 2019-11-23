package pl.altkom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:baza.sqlite");
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE Users (id INTEGER PRIMARY KEY, name TEXT)");
        System.out.println( "Hello World!" );

    }
}
