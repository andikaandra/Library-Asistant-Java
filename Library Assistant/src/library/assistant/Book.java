/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
//            System.out.println("Connected");
            String judul1 = "WAKAKA";
            String penulis1 = "buya hamka";
            String penerbit1 = "andika andra";
            String insert = "INSERT INTO book VALUES(NULL,'"+judul1+"', '"+penulis1+"', '"+penerbit1+"');";
            stmt.executeUpdate(insert);
        } catch(SQLException e){
            System.err.println(e);
        }
//        System.out.println("Hello World");
    }
}
