package library.assistant;

public class ViewBook extends javax.swing.JFrame {
    private Book book;
    private String type;
    
    public ViewBook() {
        initComponents();
    }

    public void setVariable(Book book1)
    {
        book = book1;
        bukuForm.setText(Integer.toString(book.getIdBook()));
        judulForm.setText(book.getJudul());
        penulisForm.setText(book.getPenulis());
        penerbitForm.setText(book.getPenerbit());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        judulForm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bukuForm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        penulisForm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        penerbitForm = new javax.swing.JTextField();
        renew = new javax.swing.JButton();
        submission = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Judul Buku");

        judulForm.setEnabled(false);

        jLabel1.setText("ID Buku");

        bukuForm.setEnabled(false);

        jLabel2.setText("Penulis");

        penulisForm.setEnabled(false);

        jLabel3.setText("Penerbit");

        penerbitForm.setEnabled(false);

        renew.setText("Renew");
        renew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renewonSaved(evt);
            }
        });

        submission.setText("Submission");
        submission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submissiononClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(penulisForm)
                        .addComponent(judulForm)
                        .addComponent(penerbitForm, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(bukuForm, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(renew, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(submission)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judulForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bukuForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penulisForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penerbitForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renew, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submission, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void renewonSaved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renewonSaved
        int buku = Integer.parseInt(bukuForm.getText());

        Book dataBuku = this.book;
        MainControl.transactionControl(1, dataBuku.getIdBook(), 2);
        MainControl.closeWindowViewBook(this);
    }//GEN-LAST:event_renewonSaved

    private void submissiononClosed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submissiononClosed
        Book dataBuku = this.book;
        MainControl.transactionControl(1, dataBuku.getIdBook(), 3);
        MainControl.closeWindowViewBook(this);
    }//GEN-LAST:event_submissiononClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ViewBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bukuForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField judulForm;
    private javax.swing.JTextField penerbitForm;
    private javax.swing.JTextField penulisForm;
    private javax.swing.JButton renew;
    private javax.swing.JButton submission;
    // End of variables declaration//GEN-END:variables
}
