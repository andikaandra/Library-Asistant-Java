package library.assistant;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class BookControl {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 

    public static void EditBook(Book dataBuku){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String update = "UPDATE book set judul='"+dataBuku.getJudul()+"', penulis='"+dataBuku.getPenulis()+"',penerbit='"+dataBuku.getPenerbit()+"', ketersediaan='"+dataBuku.getKetersediaan()+"' where idbook='"+dataBuku.getIdBook()+"' ";
            stmt.executeUpdate(update);
            MainControl.openDialogueBox("Data buku berhasil diubah", 2, dataBuku.getIdBook(), "buku");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void DeleteBook(Book dataBuku){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String update = "DELETE from book where idbook='"+dataBuku.getIdBook()+"' ";
            stmt.executeUpdate(update);
            MainControl.openDialogueBox("Data buku berhasil dihapus", 10, dataBuku.getIdBook(), "buku");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void AddBook(Book dataBuku){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String insert = "INSERT INTO book VALUES('"+dataBuku.getIdBook()+"','"+dataBuku.getJudul()+"', '"+dataBuku.getPenulis()+"', '"+dataBuku.getPenerbit()+"', '"+dataBuku.getKetersediaan()+"');";
            stmt.executeUpdate(insert);
            MainControl.openDialogueBox("Data buku berhasil ditambahkan", 10, dataBuku.getIdBook(), "buku");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void CheckBook(int idBook){};

    public static Book SearchBook(int id){
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT * FROM book WHERE idbook= '"+id+"'");
            
            query.first();
            
            int idbook = Integer.parseInt(query.getString("idbook"));
            String judul = query.getString("judul");
            String penulis = query.getString("penulis");
            String penerbit = query.getString("penerbit");
            String ketersediaan = query.getString("ketersediaan");
            
            Book book = new Book();
            book.setVariable(idbook, judul, penulis, penerbit, ketersediaan);            

            return book;
                
        } catch(SQLException e){
            System.err.println(e);
            return null;
        }   
    };
    
    public static void BookList(){
        MainControl.openWindowBookList();
    };
}
