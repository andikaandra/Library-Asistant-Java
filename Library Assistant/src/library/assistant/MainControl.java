package library.assistant;

public class MainControl {

    public static void openMemberWindow(){
        Window.openMemberWindow();
        System.out.println("Open New Member");
    }

    public static void openBookWindow(){
        Window.openBookWindow();
        System.out.println("Open New Book");
    }    

    public static void openEditMemberWindow(Member member){
        Window.openEditMemberWindow(member);
        System.out.println("Open EditMember");
    }                

    public static void openEditBookWindow(Book book){
        Window.openEditBookWindow(book);
        System.out.println("Open EditBook");
    }            

    public static void openMenuWindow(String type, int id){
        Window.openMenuWindow(type, id);
        System.out.println("Open Menu");
    }        
    
    public static void openWindowBookList(){
        Window.openBookListWindow();
    }

    public static void openWindowMemberList(){
        Window.openMemberListWindow();
    }
    
    
    
    public static void closeWindowMember(AddNewMember WindowAddMember){
        Window.closeMemberWindow(WindowAddMember);
        System.out.println("Close New Member");
    };
    
    public static void closeWindowBook(AddNewBook WindowAddBook){
        Window.closeBookWindow(WindowAddBook);
        System.out.println("Close New Book");
    };

    public static void closeWindowEditBook(EditBook editBook){
        Window.closeEditBookWindow(editBook);
        System.out.println("Close Edit Book");
    };
    
    public static void closeWindowEditMember(EditMember editMember){
        Window.closeEditMemberWindow(editMember);
        System.out.println("Close Edit Member");
    };
    

    public static void openDialogueBox(String pesan, int kode, int id, String type){
        DialogueBox dialogueBox = new DialogueBox();
        dialogueBox.displayDialogueBox(pesan, kode, id, type);
    };
    
    public static void closeDialogueBox(DialogueBox dialogueBox){
        DialogueBox.closeDialogueBox(dialogueBox);
    };
    
    public static void memberController(Member dataMember, int type){
        switch (type) {
            case 1:
                MemberControl.AddMember(dataMember);
                break;
            case 2:
                MemberControl.EditMember(dataMember);
                break;
            case 3:
                MemberControl.DeleteMember(dataMember);
                break;
            case 4:
                MemberControl.MemberList();
                break;
            default:
                System.out.println("Error, No match type");
                break;
        }        
    };
    
    public static void bookController(Book dataBuku, int type){
        switch (type) {
            case 1:
                BookControl.AddBook(dataBuku);
                break;
            case 2:
                BookControl.EditBook(dataBuku);
                break;
            case 3:
                BookControl.DeleteBook(dataBuku);
                break;
            case 4:
                break;
            case 5:
                BookControl.BookList();
                break;
            default:
                System.out.println("Error, No match type");
                break;
        }
    };
    
    public void transactionControl(){
        
    };
    
    public void aturanControl(){
    
    };
}
