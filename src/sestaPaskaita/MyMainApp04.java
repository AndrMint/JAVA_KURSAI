package sestaPaskaita;

import utils.QueryUtils;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Svecias on 6/13/2017.
 */
public class MyMainApp04 {
    public static void main(String[] args) {

        Connection connection = jdbcUtils.getConnection();
        String query = "CREATE TABLE test1( ID int)";
        String query1 = "CREATE TABLE students1";
        String query2 = "CREATE TABLE students";
        String query3 = "CREATE TABLE studentadress";
        String query4 = "CREATE TABLE student_marks_laukai";
        checkTable(connection, query, "test1");
        checkTable(connection, query1, "students1");
        checkTable(connection, query2, "students");
        checkTable(connection, query3, "studentadress");
        checkTable(connection, query4, "student_marks_laukai");

    }

    private static void checkTable(Connection connection, String query, String tableName){
        if (QueryUtils.isTableExist(connection, tableName)) {
            System.out.println("Lentele egzistuoja " + tableName);
        } else {
            try {
                Statement statement = connection.createStatement();
                statement.execute(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Lentele " + tableName + " sukurta sekmingai");
        }

    }

}
