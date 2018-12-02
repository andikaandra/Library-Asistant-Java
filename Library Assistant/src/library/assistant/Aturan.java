package library.assistant;

public class Aturan {
    private int batasPeminjaman;
    private int dendaPerHari;
    private String username;
    private String password;
    
    public Aturan(){
        
    }

    public void setVariable(int batasPeminjaman1, int dendaPerHari1, String username1, String password1)
    {
        batasPeminjaman = batasPeminjaman1;
        dendaPerHari = dendaPerHari1;
        username = username1;
        password = password1;
    }

    public int getBatasPeminjaman()
    {
        return batasPeminjaman;
    }

    public int getDendaPerHari()
    {
        return dendaPerHari;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }
}
