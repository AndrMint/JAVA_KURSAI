package sestaPaskaita;

import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Svecias on 6/13/2017.
 */
public class MyMainApp03 {
    public static void main(String[] args){

        Connection connection = jdbcUtils.getConnection();
        String query = "SELECT s.name, s.surname, am.mark FROM students s\n" +
                "inner join student_marks_laukai am on s.ID = am.STUDENT_ID\n" +
                "WHERE am.mark < 5";
            try {
                Statement statement = connection.createStatement();
                statement.execute(query);
            } catch (SQLException e) {
                System.out.println(e);
            }
    }
}
