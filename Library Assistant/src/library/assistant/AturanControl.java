package library.assistant;

import java.sql.*;

public class AturanControl {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 

    public static void EditAturan(Aturan aturan){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String update = "UPDATE aturan set lamaPeminjaman='"+aturan.getBatasPeminjaman()+"', denda='"+aturan.getDendaPerHari()+"',username='"+aturan.getUsername()+"', password='"+aturan.getPassword()+"' where id=1 ";
            stmt.executeUpdate(update);
            MainControl.openDialogueBox("Settings Updated", 10, aturan.getBatasPeminjaman(), "aturan");
        } catch(SQLException e){
            System.err.println(e);
        }            
    }
    
    public static Aturan OpenAturan(){
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT * FROM aturan");
            
            query.first();
            
            int lamaPeminjaman = Integer.parseInt(query.getString("lamaPeminjaman"));
            int denda = Integer.parseInt(query.getString("denda"));
            String username = query.getString("username");
            String password = query.getString("password");
            
            Aturan aturan = new Aturan();
            aturan.setVariable(lamaPeminjaman, denda, username, password);

            return aturan;
                
        } catch(SQLException e){
            System.err.println(e);
            return null;
        }  
    }
}
