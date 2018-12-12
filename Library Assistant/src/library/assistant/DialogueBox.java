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

        okButton = new javax.swing.JButton();
        alertText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(42, 46, 55));

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        alertText.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(okButton)
                .addGap(175, 175, 175))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(alertText)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(alertText)
                    .addGap(89, 89, 89)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        if(this.kode==3){
            if(null != this.type)switch (this.type) {
                case "book":
                    Book dataBuku = new Book();
                    dataBuku.setVariable(this.id, "null", "null", "null", "null");
                    MainControl.closeDialogueBox(this);
                    MainControl.bookController(dataBuku, 3);
                    break;
                case "member":
                    Member dataMember = new Member();
                    dataMember.setVariable(this.id, "null", "null", "null");
                    MainControl.closeDialogueBox(this);
                    MainControl.memberController(dataMember, 3);
                    break;
                case "error":
                    MainControl.closeErrorDialogueBox(this);
                    break;
                case "error2":
                    MainControl.closeError2DialogueBox(this);
                    break;
                default:
                    MainControl.closeDialogueBox(this);
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
    private javax.swing.JLabel alertText;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
