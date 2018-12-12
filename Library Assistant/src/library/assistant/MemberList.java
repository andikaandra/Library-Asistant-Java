package library.assistant;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MemberList extends javax.swing.JFrame {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/libraryasistant"; 
    
    public MemberList() {
        initComponents();
        displayMemberList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        membersList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data member");
        setBackground(new java.awt.Color(42, 46, 55));

        membersList.setBackground(new java.awt.Color(42, 46, 55));
        membersList.setForeground(new java.awt.Color(255, 255, 255));
        membersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "ID Member", "No HP", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        membersList.setRowHeight(20);
        membersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                membersListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(membersList);
        if (membersList.getColumnModel().getColumnCount() > 0) {
            membersList.getColumnModel().getColumn(0).setResizable(false);
            membersList.getColumnModel().getColumn(0).setPreferredWidth(6);
            membersList.getColumnModel().getColumn(1).setResizable(false);
            membersList.getColumnModel().getColumn(1).setPreferredWidth(100);
            membersList.getColumnModel().getColumn(2).setResizable(false);
            membersList.getColumnModel().getColumn(2).setPreferredWidth(20);
            membersList.getColumnModel().getColumn(3).setResizable(false);
            membersList.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersListMouseClicked
        int index = membersList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) membersList.getModel();
        
        int idmember = Integer.parseInt(model.getValueAt(index, 2).toString());

        MainControl.openMenuWindow("member", idmember);
    }//GEN-LAST:event_membersListMouseClicked

    public void displayMemberList(){        
        Connection conn;
        Statement stmt;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT * FROM member");
            
            DefaultTableModel model = (DefaultTableModel) membersList.getModel();
            int iter=1;
            while(query.next()){
                int idmember = Integer.parseInt(query.getString("idmember"));
                String nama = query.getString("nama");
                String hp = query.getString("nohp");
                String email = query.getString("email");
                
                model.addRow(new Object[]{iter++, nama, idmember, hp, email});
            }
        } catch(SQLException e){
            System.err.println(e);
        }   
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MemberList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable membersList;
    // End of variables declaration//GEN-END:variables
}
