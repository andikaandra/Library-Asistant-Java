package library.assistant;

public class Member {
    private int idmember;
    private String nama;
    private String nohp;
    private String email;

    
    public Member(){
        
    }

    public void setVariable(int member1, String nama1, String hp1, String email1)
    {
        idmember = member1;
        nama = nama1;
        nohp = hp1;
        email = email1;
    }

    public int getIdMember()
    {
        return idmember;
    }

    public String getNama()
    {
        return nama;
    }

    public String getNoHp()
    {
        return nohp;
    }

    public String getEmail()
    {
        return email;
    }
    
    public static void main(String[] args){
        System.out.println("Success");
    }
}
