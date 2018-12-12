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

        okButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        testt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(42, 46, 55));

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

        testt.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(testt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(testt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(noButton))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        if(this.type.equals("issue")){
            this.dispose();
            MainControl.transactionControl(this.member, this.book, 1);
        }
    }//GEN-LAST:event_okButtonMouseClicked

    private void noButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noButtonMouseClicked
        if(this.type.equals("issue")){
            MainControl.closeDialogueBoxIssue(this);
        }
    }//GEN-LAST:event_noButtonMouseClicked

    public void displayDialogueBoxTransaction(String pesan, int member1, int book1, String type1){
        testt.setText(pesan);
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
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel testt;
    // End of variables declaration//GEN-END:variables
}
