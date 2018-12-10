package library.assistant;


public class TransaksiPeminjaman {
    private int idtransaksi;
    private int idmember;
    private int idbook;

    public void setVariable(int member1, int book1, int transaksi1)
    {
        idmember = member1;
        idbook = book1;
        idtransaksi = transaksi1;
    }

    public int getIdTransaksi()
    {
        return idtransaksi;
    }

    public int getIdMember()
    {
        return idmember;
    }

    public int getIdBook()
    {
        return idbook;
    }
    
    private TransactionState statetransaction;

    public TransaksiPeminjaman(){
        statetransaction = new TransaksiBelumDiVerifikasi(this);
    }
    
    public void setState(TransactionState ls){
        statetransaction = ls;
    }
    
    public void transaksiBaru(){};
    public void persyaratanTidakLengkap(){};
    public void persyaratanLengkap(){};
    public void transaksiDiperpanjang(){};
    public void bukuDikembalikan(){};
    public void transaksiBerakhir(){};
    public void transaksiTidakBerhasil(){};
}
