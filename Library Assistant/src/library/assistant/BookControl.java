package library.assistant;

import java.sql.*;

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
            
            String updates = "DELETE from transaksipeminjaman where idbook='"+dataBuku.getIdBook()+"' ";
            stmt.executeUpdate(updates);
            
            MainControl.openDialogueBox("Data buku berhasil dihapus", 10, dataBuku.getIdBook(), "close");
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void AddBook(Book dataBuku){
        Connection conn;
        Statement stmt;
        boolean usernameExists = false;        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            int temp = dataBuku.getIdBook();
            ResultSet query = stmt.executeQuery("SELECT * FROM book");
            while(query.next()){
                int idmember = Integer.parseInt(query.getString("idbook"));
                if(idmember==temp){
                    System.out.println("Sama");
                    usernameExists = true;
                    break;
                }
            }
            if(usernameExists){
                MainControl.openDialogueBox("Error, Duplikasi primary key", 3, dataBuku.getIdBook(), "error");
            }
            else{
                String insert = "INSERT INTO book VALUES('"+dataBuku.getIdBook()+"','"+dataBuku.getJudul()+"', '"+dataBuku.getPenulis()+"', '"+dataBuku.getPenerbit()+"', '"+dataBuku.getKetersediaan()+"');";
                stmt.executeUpdate(insert);
                MainControl.openDialogueBox("Data buku berhasil ditambahkan", 10, dataBuku.getIdBook(), "buku");
            }

        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static boolean CheckBook(int idBook){
        Connection conn;
        Statement stmt;
        boolean bookExists = false; 
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("SELECT * FROM transaksipeminjaman WHERE idbook = '"+idBook+"'");
            if (!query.isBeforeFirst()) {
                System.out.println("No book");
                return false;
            }
            else{
                System.out.println("ada");
                return true;
            }
        } catch(SQLException e){
            System.err.println(e);
            return false;
        }   

    };

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
