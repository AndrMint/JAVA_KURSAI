package utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Created by Svecias on 6/13/2017.
 */
public class QueryUtils {
    public static void printResultSet(ResultSet resultSet){
        try {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            while (resultSet.next()){
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i< resultSetMetaData.getColumnCount();i++){
                    sb.append(resultSetMetaData.getColumnName(i)).append("=")
                    .append(resultSet.getObject(i)).append(" ");
                }
                System.out.println(sb.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
