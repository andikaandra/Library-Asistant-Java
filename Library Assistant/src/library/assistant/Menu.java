package library.assistant;

/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {
    private int id;
    private String type;
    
    public Menu() {
        initComponents();
    }

    public void setVariable(String type1, int id1)
    {
        type = type1;
        id = id1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editClicked(evt);
            }
        });

        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(delete))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editClicked
        if("book".equals(this.type)){
            Book book =  BookControl.SearchBook(this.id);
            MainControl.openEditBookWindow(book);
        }
        else if("member".equals(this.type)){
            Member member =  MemberControl.SearchMember(this.id);
            MainControl.openEditMemberWindow(member);
        }
    }//GEN-LAST:event_editClicked

    private void deleteClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteClicked
        if("book".equals(this.type)){
            MainControl.openDialogueBox("Apakah data buku akan dihapus atau tidak?",3, this.id, this.type);
        }
        else if("member".equals(this.type)){
            MainControl.openDialogueBox("Apakah data member akan dihapus atau tidak?",3, this.id, this.type);
        }
    }//GEN-LAST:event_deleteClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    // End of variables declaration//GEN-END:variables
}
