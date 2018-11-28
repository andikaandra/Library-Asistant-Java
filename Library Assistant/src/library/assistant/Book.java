package library.assistant;
import java.sql.*;

/**
 *
 * @author Bosmo
 */
public class Book {
    private int idbook;
    private String judul;
    private String penulis;
    private String penerbit;
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 
    
    public Book(){
        
    }

    public static void addBook(int buku, String judul, String penulis, String penerbit){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
//            System.out.println("Connected");
            String insert = "INSERT INTO book VALUES('"+buku+"','"+judul+"', '"+penulis+"', '"+penerbit+"');";
            stmt.executeUpdate(insert);
        } catch(SQLException e){
            System.err.println(e);
        }        
    }    
    
    public static void main(String[] args){
        System.out.println("Success");
    }
}
