package library.assistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaksiControl {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 
    
    public static void renew(){
        
    };
    
    public static void submission(){
        
    };
    
    public static void addTransaction(int memberID, int bookID){
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String insert = "INSERT INTO transaksipeminjaman VALUES(NULL,'"+memberID+"', '"+bookID+"', 0);";
            stmt.executeUpdate(insert);
            MainControl.openDialogueBox("Pencatatan transaksi peminjaman berhasil", 10, 1, "transaksi");

        } catch(SQLException e){
            System.err.println(e);
        }   
    };
    
}
