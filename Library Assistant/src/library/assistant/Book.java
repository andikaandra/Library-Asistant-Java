package library.assistant;

public class Book {
    private int idbook;
    private String judul;
    private String penulis;
    private String penerbit;
    private String ketersediaan;
 
    public Book(){
        
    }

    public void setVariable(int buku1, String judul1, String penulis1, String penerbit1, String ketersediaan1)
    {
        idbook = buku1;
        judul = judul1;
        penulis = penulis1;
        penerbit = penerbit1;
        ketersediaan = ketersediaan1;
    }

    public int getIdBook()
    {
        return idbook;
    }

    public String getJudul()
    {
        return judul;
    }

    public String getPenulis()
    {
        return penulis;
    }

    public String getPenerbit()
    {
        return penerbit;
    }

    public String getKetersediaan()
    {
        return ketersediaan;
    }
    
    public static void main(String[] args){

    }
}
