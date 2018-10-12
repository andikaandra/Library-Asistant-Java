/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assistant;

import java.sql.Timestamp;


/**
 *
 * @author Bosmo
 */
public class RincianTransaksi {
    public int IDRincian;
    public Buku buku;
    public TransaksiPeminjaman transaksi;
    private Timestamp waktuPinjam;
    private Timestamp waktuKembali;    
}
