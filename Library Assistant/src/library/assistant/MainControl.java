package library.assistant;

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

    public void openDialogueBox(){
    
    };
    
    public void closeDialogueBox(){
    
    };
    
    public static void memberController(Member dataMember, int type){
        switch (type) {
            case 1:
                MemberControl.AddMember(dataMember);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                MemberControl.memberList();
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
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                BookControl.bookList();
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
