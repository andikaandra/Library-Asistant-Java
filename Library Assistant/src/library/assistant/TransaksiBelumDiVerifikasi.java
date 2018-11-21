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
public class TransaksiBelumDiVerifikasi implements TransactionState{
    public TransaksiBelumDiVerifikasi(TransaksiPeminjaman tp){
        context=tp;
    }
    
    @Override
    public void persyaratanTidakLengkap(){
//        context.setState(new TransaksiBatal(context));
    }

    @Override    
    public void persyaratanLengkap(){
        
    }
    

    @Override
    public void transaksiBaru() {

    }

    @Override
    public void transaksiDiperpanjang() {

    }

    @Override
    public void bukuDikembalikan() {

    }

    @Override
    public void transaksiBerakhir() {

    }

    @Override
    public void transaksiTidakBerhasil() {


    }
    private TransaksiPeminjaman context = null;
}
