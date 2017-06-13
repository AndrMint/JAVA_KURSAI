package sestaPaskaita;

import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Svecias on 6/13/2017.
 */
public class MyMainApp02 {
    public static void main(String[] args){
        Connection connection = jdbcUtils.getConnection();   //connection//statement//quer//
        String query = "update students SET surname = 'Jsds' where id=1 ";     //set stulpelio vardas ir reiksme
        try {
            Statement statement = connection.createStatement();
            statement.execute(query); //string'e query reikia parasyti
        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}
