package library.assistant;

public class EditAturan extends javax.swing.JFrame {
    private Aturan aturan;
    public EditAturan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lamaForm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dendaForm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usernameForm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordForm = new javax.swing.JTextField();
        saveAturan = new javax.swing.JButton();
        closeAturan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Lama Peminjaman Buku");

        jLabel1.setText("Denda Per Hari");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        saveAturan.setText("Save");
        saveAturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveAturanonSaved(evt);
            }
        });

        closeAturan.setText("Cancel");
        closeAturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeAturanonClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(saveAturan)
                        .addGap(27, 27, 27)
                        .addComponent(closeAturan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(usernameForm)
                            .addComponent(lamaForm)
                            .addComponent(passwordForm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(dendaForm, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lamaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dendaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveAturan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeAturan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setVariable(Aturan aturan1)
    {
        aturan = aturan1;
        lamaForm.setText(Integer.toString(aturan.getBatasPeminjaman()));
        dendaForm.setText(Integer.toString(aturan.getDendaPerHari()));
        usernameForm.setText(aturan.getUsername());
        passwordForm.setText(aturan.getPassword());
    }    
    
    
    private void saveAturanonSaved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAturanonSaved
        int lama = Integer.parseInt(lamaForm.getText());
        int denda = Integer.parseInt(dendaForm.getText());
        String username = usernameForm.getText();
        String password = passwordForm.getText();

        Aturan dataAturan = new Aturan();
        dataAturan.setVariable(lama, denda, username, password);

        MainControl.aturanController(dataAturan);
    }//GEN-LAST:event_saveAturanonSaved

    private void closeAturanonClosed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeAturanonClosed
        MainControl.closeWindowAturan(this);
    }//GEN-LAST:event_closeAturanonClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditAturan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeAturan;
    private javax.swing.JTextField dendaForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lamaForm;
    private javax.swing.JTextField passwordForm;
    private javax.swing.JButton saveAturan;
    private javax.swing.JTextField usernameForm;
    // End of variables declaration//GEN-END:variables
}
