package library.assistant;

public class Sidebar extends javax.swing.JPanel {

    public Sidebar() {
        initComponents();
        this.setVisible(false);        
    }
    
    public static void displaySidebar(Sidebar sidebar) {
        sidebar.setVisible(true);
    }

    public static void closeSidebar(Sidebar sidebar) {
        sidebar.setVisible(false);
    }    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(42, 46, 55));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 194, 134), 2));

        jButton1.setText("Add Member");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMemberOnClicked(evt);
            }
        });

        jButton2.setText("Add Book");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookOnClicked(evt);
            }
        });

        jButton3.setText("Member List");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberListOnClicked(evt);
            }
        });

        jButton4.setText("Book List");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListOnClicked(evt);
            }
        });

        jButton5.setText("Setting");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingOnClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMemberOnClicked
        MainControl.openMemberWindow();
    }//GEN-LAST:event_addMemberOnClicked

    private void addBookOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookOnClicked
        MainControl.openBookWindow();
    }//GEN-LAST:event_addBookOnClicked

    private void memberListOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberListOnClicked
        MainControl.memberController(null, 4);
    }//GEN-LAST:event_memberListOnClicked

    private void bookListOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListOnClicked
        MainControl.bookController(null, 5);
    }//GEN-LAST:event_bookListOnClicked

    private void settingOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingOnClicked

    }//GEN-LAST:event_settingOnClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
