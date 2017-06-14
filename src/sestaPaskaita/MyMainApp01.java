package sestaPaskaita;

import utils.IsvedaBetka;
import utils.QueryUtils;
import utils.jdbcUtils;

import java.sql.*;


public class MyMainApp01 {
    public static void main(String[] args){

        Connection connection = jdbcUtils.getConnection();
        if (QueryUtils.isTableExist(connection, "students")){
            System.out.println("Students lentele yra sukurta");
        }

        ResultSet resultSet = jdbcUtils.getResultSet(connection, "SELECT * FROM students");
        IsvedaBetka.printResultSet(resultSet);

    }
}
