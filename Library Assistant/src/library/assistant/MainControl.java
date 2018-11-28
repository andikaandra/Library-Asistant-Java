package library.assistant;
/**
 *
 * @author Bosmo
 */
public class MainControl {
    public static void openWindow(String type){
        if(type.equals("Member")){
            Window.openMemberWindow();
            System.out.println("Open New Member");
        }
        else if(type.equals("Book")){
            Window.openBookWindow();
            System.out.println("Open New Book");
        }
    };
    
    public static void closeWindowM(AddNewMember WindowAddMember){
        Window.closeMemberWindow(WindowAddMember);
        System.out.println("Close New Member");
    };
    
    public static void closeWindowB(AddNewBook WindowAddBook){
        Window.closeBookWindow(WindowAddBook);
        System.out.println("Close New Book");
    };

    public void openDialogueBox(){};
    public void closeDialogueBox(){};
    public static void memberController(int member, String nama, String hp, String email){
        MemberControl.AddMember(member, nama, hp, email);
    };
    public static void bookController(int buku, String judul, String penulis, String penerbit){
        BookControl.AddBook(buku, judul, penulis, penerbit);
    };
    public void transactionControl(){};
    public void aturanControl(){};
}
