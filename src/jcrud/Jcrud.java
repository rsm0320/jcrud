package jcrud;

import java.sql.*;

public class Jcrud {

    public static Connection mysqlConnect(
            String hostname, 
            String database, 
            String username, 
            String password 
    ) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection( 
                    "jdbc:mysql://" + hostname + ":3306/" + database, 
                    username, 
                    password 
            );
        } catch (Exception error) {
            System.out.println("Oooops! Erro no banco de dados! " + error);
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
    }

}
