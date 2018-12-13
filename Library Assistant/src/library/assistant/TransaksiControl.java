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
        boolean bookExists = false; 
        boolean bookBorrowed = false;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("SELECT * FROM book WHERE idbook = '"+bookID+"'");
            if (!query.isBeforeFirst()) {
                bookExists= true;
            }
            ResultSet querys = stmt.executeQuery("SELECT * FROM transaksipeminjaman WHERE idbook = '"+bookID+"'");
            if (querys.isBeforeFirst()) {
                bookBorrowed= true;
            }
            ResultSet query2 = stmt.executeQuery("SELECT * FROM member WHERE idmember = '"+memberID+"'");
            if (!query2.isBeforeFirst() || bookExists || bookBorrowed) {
                MainControl.openDialogueBox("Transaksi peminjaman gagal", 3, 10, "error2");
            }
            else{
                System.out.println("ada");
                String insert = "INSERT INTO transaksipeminjaman VALUES(NULL,'"+memberID+"', '"+bookID+"', 0);";
                stmt.executeUpdate(insert);

                String update = "UPDATE book set ketersediaan='dipinjam' where idbook='"+bookID+"' ";
                stmt.executeUpdate(update);
                MainControl.openDialogueBox("Pencatatan transaksi peminjaman berhasil", 10, 1, "transaksi");
            }


        } catch(SQLException e){
            System.err.println(e);
        }   
    };

    public static void renewTransaction(int bookID){
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String update = "UPDATE transaksipeminjaman set status=1 where idbook='"+bookID+"' ";
            stmt.executeUpdate(update);            
            
            MainControl.openDialogueBox("Peminjaman buku berhasil diperpanjang", 10, 1, "transaksi");
        } catch(SQLException e){
            System.err.println(e);
        }   
    };


    public static void submissionTransaction(int bookID){
        Connection conn;
        Statement stmt;
        boolean bookExists = false; 
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            String update = "DELETE from transaksipeminjaman where idbook='"+bookID+"' ";
            stmt.executeUpdate(update);

            String updatez = "UPDATE book set ketersediaan='ada' where idbook='"+bookID+"' ";
            stmt.executeUpdate(updatez);
            MainControl.openDialogueBox("Pengembalian buku berhasil", 10, 1, "transaksi");

        } catch(SQLException e){
            System.err.println(e);
        }   
    };    
}
