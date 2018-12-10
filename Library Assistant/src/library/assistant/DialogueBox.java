package library.assistant;

public class DialogueBox extends javax.swing.JFrame {
    private int id;
    private String type;
    private int kode;
    
    public DialogueBox() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertText = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alertText.setDragEnabled(true);
        alertText.setEnabled(false);

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(alertText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(alertText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        if(this.kode==3){
            if(null != this.type)switch (this.type) {
                case "book":
                    Book dataBuku = new Book();
                    dataBuku.setVariable(this.id, "null", "null", "null", "null");
                    MainControl.bookController(dataBuku, 3);
                    break;
                case "member":
                    Member dataMember = new Member();
                    dataMember.setVariable(this.id, "null", "null", "null");
                    MainControl.memberController(dataMember, 3);
                    break;
                case "error":
                    MainControl.closeErrorDialogueBox(this);
                    break;
                case "error2":
                    MainControl.closeError2DialogueBox(this);
                    break;
                default:
                    break;
            }
        }
        else if(this.type.equals("transaksi")){
            MainControl.closeDialogueBox(this);
        }
        else{
            MainControl.closeDialogueBox(this);
        }

    }//GEN-LAST:event_okButtonMouseClicked

    public void displayDialogueBox(String pesan, int kode1, int id1, String type1){
        alertText.setText(pesan);
        id = id1;
        type = type1;
        kode = kode1;
        this.setVisible(true);
    }
    
    public static void closeDialogueBox(DialogueBox dialogue){
        dialogue.dispose();
    }

    public static void closeErrorDialogueBox(DialogueBox dialogue){
        dialogue.dispose();
        MainControl.openDialogueBox("Data tidak bisa ditambahkan", 3, 10, "error2");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DialogueBox().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alertText;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
