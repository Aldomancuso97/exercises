package EsercizioCompleto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQL {

    public static void main(String[] args) throws SQLException {
        //CREO UNA CONNESSIONE CON IL DATABASE PRESENTE NEL SISTEMA LOCALE
        String host = "jdbc:mysql://lolcalhost:3306/newdb";
        String user = "developer";
        String password = "passwordhere";

        Connection conn = DriverManager.getConnection(host, user, password);
        Statement statement = conn.createStatement();

        //HO CREATO LA TABELLA
        String CeateTable = "CREATE TABLE students (" +
                "id_students INT(30) NOT NULL," +
                "last_name VARCHAR(255)," +
                "first_name VARCHAR(255)," +
                "PRIMARY KEY (id_students) )";
        //statement.executeUpdate(CeateTable);

        //INSERISCO UTENTI ALLA TABELLA
        /*
        statement.executeUpdate("INSERT INTO students (students.last_name,students.first_name) VALUES ('aldo','mancuso')");
        statement.executeUpdate("INSERT INTO students (students.last_name,students.first_name) VALUES ('salvatore','mancuso')");
        statement.executeUpdate("INSERT INTO students (students.last_name,students.first_name) VALUES ('mario','rossi')");
        statement.executeUpdate("INSERT INTO students (students.last_name,students.first_name) VALUES ('paolo','suisio')");
        */

        //STO INTERROGANDO IL DATABASE PER PASSARMI SULLA CONSOLE I DATI DELLE DUE COLONNE
        //PASSANDO I COGNOMI IN UNA LISTA

        /*
        ResultSet rs = statement.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            String resultname = rs.getString("last_name");
            String resultsurname = rs.getString("first_name");

            List<String> surnameList = new ArrayList<>();
            surnameList.add(resultsurname);
            System.out.println(surnameList);*/

            //AGGIUNGO ALLA TABELLA UNA COLONNA COUNTRY
            //statement.executeUpdate("ALTER TABLE students ADD country VARCHAR(30)");







        }
    }


