package Cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDriverConnection {

    public Connection getConnection(){
        try {
            return  DriverManager.getConnection(
                    "jdbc:sqlserver://Server=localhost\\SQLEXPRESS;Database=Teste;Trusted_Connection=True;"
            );


        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }








        public static void main(String[]args){
      JDBCDriverConnection cx = new JDBCDriverConnection();
      cx.getConnection();
        }
    }





