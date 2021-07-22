package Cadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDriverConnection {

    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/henri/Desktop/Estudos/CadastarProdutosCestão/Teste";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }



   public void insert(String name, int unidade,String data) {
        String sql = "INSERT INTO Produto(Nome,Unidade,Data) VALUES ('')";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, unidade);
            pstmt.setString(3,data);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



        public static void main(String[]args){
      JDBCDriverConnection cx=new JDBCDriverConnection();
      connect();
   cx.insert("testpro",3,"21/07/2021");

        }
    }





