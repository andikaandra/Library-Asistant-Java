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

        setBackground(new java.awt.Color(255, 204, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 194, 134), 2));

        jButton1.setBackground(new java.awt.Color(42, 46, 55));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Member");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setIconTextGap(0);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMemberOnClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(42, 46, 55));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Book");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setIconTextGap(0);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookOnClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(42, 46, 55));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Member List");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setIconTextGap(0);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberListOnClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(42, 46, 55));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book List");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setIconTextGap(0);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListOnClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(42, 46, 55));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Setting");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setIconTextGap(0);
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
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
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
        MainControl.openWindowAturan();
    }//GEN-LAST:event_settingOnClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
