import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Esercizio2 {
    public static void main(String[] args) {

       try{
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","developer","passwordhere");
           Statement statement = connection.createStatement();
       }catch(Exception e) {
           e.printStackTrace();
        }
       }



    }

