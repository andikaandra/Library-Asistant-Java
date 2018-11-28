package library.assistant;

import java.sql.*;


public class BookControl {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 

    public static void editBook(Book book){};
    
    public static void deleteBook(Book book){};
    
    public static void AddBook(Book dataBuku){
        Connection conn;
        Statement stmt;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String insert = "INSERT INTO book VALUES('"+dataBuku.getIdBook()+"','"+dataBuku.getJudul()+"', '"+dataBuku.getPenulis()+"', '"+dataBuku.getPenerbit()+"');";
            stmt.executeUpdate(insert);
        } catch(SQLException e){
            System.err.println(e);
        }    
    };
    
    public static void checkBook(int idBook){};
    
    public static void bookList(){
        MainControl.openWindowBookList();
    };
}
