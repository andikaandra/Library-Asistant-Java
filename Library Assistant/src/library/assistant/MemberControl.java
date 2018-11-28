package library.assistant;

import java.sql.*;

public class MemberControl {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 

    public void EditMember(Member member){
        
    };
    
    public void DeleteMember (Member member){
        
    };
    
    public static void AddMember (Member dataMember){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
//            System.out.println("Connected");
            String insert = "INSERT INTO member VALUES('"+dataMember.getIdMember()+"','"+dataMember.getNama()+"', '"+dataMember.getNoHp()+"', '"+dataMember.getEmail()+"');";
            stmt.executeUpdate(insert);
        } catch(SQLException e){
            System.err.println(e);
        }        
    };
    
    public static void memberList(){
        MainControl.openWindowMemberList();
    };
}
