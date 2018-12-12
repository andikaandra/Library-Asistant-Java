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

    public static void openBookListWindow(){
        BookList listBook = new BookList();
        listBook.setVisible(true);
    }

    public static void openMemberListWindow(){
        MemberList listMember = new MemberList();
        listMember.setVisible(true);
    }

    public static void openAturanWindow(){
        EditAturan editAturan = new EditAturan();
        editAturan.setVariable(AturanControl.OpenAturan());
        editAturan.setVisible(true);
    }

    public static void openEditBookWindow(Book book){
        EditBook editBook = new EditBook();
        editBook.setVariable(book);
        editBook.setVisible(true);
    }

    public static void openViewBookWindow(Book book){
        ViewBook viewBook = new ViewBook();
        viewBook.setVariable(book);
        viewBook.setVisible(true);
    }    
    
    public static void openEditMemberWindow(Member member){
        EditMember editMember = new EditMember();
        editMember.setVariable(member);
        editMember.setVisible(true);
    }
    
    
    
    public static void closeMemberWindow(AddNewMember WindowAddMember){
        WindowAddMember.dispose();
    };

    public static void closeBookWindow(AddNewBook WindowAddBook){
        WindowAddBook.dispose();
    };

    public static void closeEditBookWindow(EditBook editBook){
        editBook.dispose();
    };

    public static void closeViewBookWindow(ViewBook viewBook){
        viewBook.dispose();
    };
    
    public static void closeEditMemberWindow(EditMember editMember){
        editMember.dispose();
    };    

    public static void closeEditAturanWindow(EditAturan editAturan){
        editAturan.dispose();
    };        
    
    
    public static void openMenuWindow(String type, int id) {
        Menu windowMenu = new Menu();
        windowMenu.setVariable(type, id);
        windowMenu.setVisible(true);
    }

}
