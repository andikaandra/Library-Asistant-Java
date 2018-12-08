package library.assistant;

import java.sql.*;

public class MemberControl {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 

    public static void EditMember(Member dataMember){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String update = "UPDATE member set nama='"+dataMember.getNama()+"', nohp='"+dataMember.getNoHp()+"', email='"+dataMember.getEmail()+"' where idmember='"+dataMember.getIdMember()+"' ";
            stmt.executeUpdate(update);
            MainControl.openDialogueBox("Data member berhasil diubah", 2, dataMember.getIdMember(), "member");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void DeleteMember (Member dataMember){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String update = "DELETE from member where idmember='"+dataMember.getIdMember()+"' ";
            stmt.executeUpdate(update);
            MainControl.openDialogueBox("Data member berhasil dihapus", 10, dataMember.getIdMember(), "member");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void AddMember (Member dataMember){
        Connection conn;
        Statement stmt;
        boolean usernameExists = false;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
//            System.out.println("Connected");
            int temp = dataMember.getIdMember();
            ResultSet query = stmt.executeQuery("SELECT * FROM member");
            while(query.next()){
                int idmember = Integer.parseInt(query.getString("idmember"));
                if(idmember==temp){
                    System.out.println("Sama");
                    usernameExists = true;
                    break;
                }
            }
            if(usernameExists){
                MainControl.openDialogueBox("Error, Duplikasi primary key", 3, dataMember.getIdMember(), "error");                
            }
            else{
                String insert = "INSERT INTO member VALUES('"+dataMember.getIdMember()+"','"+dataMember.getNama()+"', '"+dataMember.getNoHp()+"', '"+dataMember.getEmail()+"');";
                stmt.executeUpdate(insert);
                MainControl.openDialogueBox("Data member berhasil ditambahkan", 10, dataMember.getIdMember(), "member");
            }

        } catch(SQLException e){
            System.err.println(e);
        }        
    };

    public static Member SearchMember (int id){
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT * FROM member WHERE idmember= '"+id+"'");
            
            query.first();
            
            int idmember = Integer.parseInt(query.getString("idmember"));
            String nama = query.getString("nama");
            String nohp = query.getString("nohp");
            String email = query.getString("email");
            
            Member member = new Member();
            member.setVariable(idmember, nama, nohp, email);

            return member;
                
        } catch(SQLException e){
            System.err.println(e);
            return null;
        }     
    };
    
    public static void MemberList(){
        MainControl.openWindowMemberList();
    };
}
