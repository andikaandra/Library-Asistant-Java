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
    
    
    
    public void persyaratanTidakLengkap(){
        context.setState(new TransaksiBatal(context));
    }
    public void persyaratanLengkap(){
        
    }
    
    private TransaksiPeminjaman context = null;
}
