package StudentsManagementApplication;

import utils.QueryUtils;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Svecias on 6/14/2017.
 */
public class CreateNewStudent {
    private Scanner scanner;


    CreateNewStudent(Scanner scanner){
        this.scanner = scanner;
    }

    public void createNewStudent (){ //vardas //pavarde //email
        System.out.println("Ivesti varda");
        String vardas = scanner.next();
        System.out.println("Iveskitd telefono nr");
        String numeris = scanner.next();
        System.out.println("Iveskite pavarde");
        String pavarde = scanner.next();
        System.out.println("Iveskite pasta");
        String email = scanner.next();

        Connection connection = jdbcUtils.getConnection();
        String query = "SELECT * FROM students WHERE NAME = '"+vardas+"' AND SURNAME = '"+pavarde+"'";

        ResultSet resultSetGrazinimas = jdbcUtils.getResultSet(connection, query); //ResultSet turi metoda next
        try {
            if (resultSetGrazinimas.next()){
                System.out.println("Toks vartotojas egzistuoja");
            }else {
                String queryNEW = "INSERT INTO students(EMAIL,NAME, PHONE, SURNAME)VALUES('"+email+"','"+vardas+"','"+numeris+"','"+pavarde+"')";
                Statement st = connection.createStatement();
                st.execute(queryNEW);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

