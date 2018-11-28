package library.assistant;

/**
 *
 * @author ASUS
 */
public class Window {
    public static void openMemberWindow(){
        AddNewMember WindowAddMember = new AddNewMember();
        WindowAddMember.setVisible(true);
    };

    public static void openBookWindow(){
        AddNewBook WindowAddBook = new AddNewBook();
        WindowAddBook.setVisible(true);
    };

    public static void closeMemberWindow(AddNewMember WindowAddMember){
        WindowAddMember.dispose();
    };

    public static void closeBookWindow(AddNewBook WindowAddBook){
        WindowAddBook.dispose();
    };
}
