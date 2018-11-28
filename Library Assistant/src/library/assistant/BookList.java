package library.assistant;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class BookList extends javax.swing.JFrame {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 
    
    public BookList() {
        initComponents();
        displayBookList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        booksList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book List");

        booksList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Judul Buku", "ID Buku", "Penulis", "Penerbit", "Ketersediaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksList.setGridColor(new java.awt.Color(0, 0, 0));
        booksList.setRowHeight(20);
        jScrollPane1.setViewportView(booksList);
        if (booksList.getColumnModel().getColumnCount() > 0) {
            booksList.getColumnModel().getColumn(0).setResizable(false);
            booksList.getColumnModel().getColumn(0).setPreferredWidth(15);
            booksList.getColumnModel().getColumn(1).setResizable(false);
            booksList.getColumnModel().getColumn(1).setPreferredWidth(180);
            booksList.getColumnModel().getColumn(2).setResizable(false);
            booksList.getColumnModel().getColumn(2).setPreferredWidth(30);
            booksList.getColumnModel().getColumn(3).setResizable(false);
            booksList.getColumnModel().getColumn(4).setResizable(false);
            booksList.getColumnModel().getColumn(5).setResizable(false);
            booksList.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayBookList(){
        
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT * FROM book");
            
            DefaultTableModel model = (DefaultTableModel) booksList.getModel();
            int iter=1;
            while(query.next()){
                int idbook = Integer.parseInt(query.getString("idbook"));
                String judul = query.getString("judul");
                String penulis = query.getString("penulis");
                String penerbit = query.getString("penerbit");

                model.addRow(new Object[]{iter++, judul, idbook, penerbit, penulis, "ada"});
            }
        } catch(SQLException e){
            System.err.println(e);
        }   
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new BookList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booksList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
