package library.assistant;

public class DialogueBoxTransaction extends javax.swing.JFrame {
    private int member;
    private String type;
    private int book;
    
    public DialogueBoxTransaction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertText = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alertText.setDragEnabled(true);
        alertText.setEnabled(false);

        okButton.setText("Yes");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        noButton.setText("No");
        noButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(alertText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(alertText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(noButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        if(this.type.equals("issue")){
            MainControl.transactionControl(this.member, this.book, 1);
        }
    }//GEN-LAST:event_okButtonMouseClicked

    private void noButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noButtonMouseClicked
        if(this.type.equals("issue")){
            MainControl.closeDialogueBoxIssue(this);
        }
    }//GEN-LAST:event_noButtonMouseClicked

    public void displayDialogueBoxTransaction(String pesan, int member1, int book1, String type1){
        alertText.setText(pesan);
        member = member1;
        type = type1;
        book = book1;
        this.setVisible(true);
    }    
    
    public static void closeDialogueBoxIssue(DialogueBoxTransaction dialogue){
        dialogue.dispose();
        MainControl.openDialogueBox("Transaksi peminjaman tidak jadi dilakukan", 3, 10, "error2");
    }    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DialogueBoxTransaction().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alertText;
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
