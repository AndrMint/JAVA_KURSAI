package utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUtils {
    public static boolean isTableExist(Connection connection, String tableName)      {      //boolean grazins true arba false

        boolean isTableExist = false;
        if(connection != null && StringUtils.isNotBlank(tableName)){
            try {
                DatabaseMetaData metaData = connection.getMetaData();
                ResultSet resultSet = metaData.getTables(null, null, tableName, null);
                isTableExist = resultSet.next();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isTableExist;
    }
}
