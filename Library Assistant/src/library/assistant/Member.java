package library.assistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bosmo
 */
public class Member {
    private int idmember;
    private String nama;
    private String nohp;
    private String email;

    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 
    
    public Member(){
        
    }
    
    public static void addMember(int member, String nama, String hp, String email){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
//            System.out.println("Connected");
            String insert = "INSERT INTO member VALUES('"+member+"','"+nama+"', '"+hp+"', '"+email+"');";
            stmt.executeUpdate(insert);
        } catch(SQLException e){
            System.err.println(e);
        }        
    }
    
    public static void main(String[] args){
        System.out.println("Success");
    }
}
