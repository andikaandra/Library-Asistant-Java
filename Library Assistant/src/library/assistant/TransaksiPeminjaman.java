/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assistant;

/**
 *
 * @author Bosmo
 */
public class TransaksiPeminjaman {
    private int idtransaksi;
    private Member member;
    private int denda;
    private TransactionState statetransaction;
    public TransaksiPeminjaman(){
        statetransaction = new TransaksiBelumDiverifikasi(this);
    }
    
    public setState(TransactionState ts){
        statetransaction = ls;
    }
    
    public void transactionBaru(){}
    public void persyaratanTidakLengkap(){}
    public void persyaratanLengkap(){}
    public void transaksiDiperpanjang(){}
    public void bukuDikembalikan(){}
}
