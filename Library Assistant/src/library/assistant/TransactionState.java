/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assistant;

/**
 *
 * @author ASUS
 */
public interface TransactionState {
    public void transactionBaru();
    public void persyaratanTidakLengkap();
    public void persyaratanLengkap();
    public void transaksiDiperpanjang();
    public void bukuDikembalikan();
}
