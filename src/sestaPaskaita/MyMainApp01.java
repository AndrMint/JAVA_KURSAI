package sestaPaskaita;

import utils.QueryUtils;
import utils.jdbcUtils;

import java.sql.*;

/**
 * Created by Svecias on 6/13/2017.
 */
public class MyMainApp01 {
    public static void main(String[] args){

        Connection connection = jdbcUtils.getConnection();

        ResultSet resultSet = jdbcUtils.getResultSet(connection, "SELECT * FROM students");
        QueryUtils.printResultSet(resultSet);

    }
}
