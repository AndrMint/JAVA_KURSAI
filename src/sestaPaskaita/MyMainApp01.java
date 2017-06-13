package sestaPaskaita;

import utils.jdbcUtils;

import java.sql.*;

/**
 * Created by Svecias on 6/13/2017.
 */
public class MyMainApp01 {
    public static void main(String[] args){

        Connection connection = jdbcUtils.getConnection();

        ResultSet resultSet = jdbcUtils.getResultSet(connection, "SELECT * FROM students");
        if (resultSet != null){
            try {
                while (resultSet.next()){      //tikris tol, kol visus perziures
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=").append(resultSet.getInt("id")).append(", name=")
                            .append(resultSet.getString("name")).append(", surname=")
                            .append(resultSet.getString(3)).append(", phone=")
                    .append(resultSet.getString("phone")).append(", email=")
                    .append(resultSet.getString("email"));

                    System.out.println(sb.toString());
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
