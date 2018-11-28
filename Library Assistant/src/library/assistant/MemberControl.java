package library.assistant;

/**
 *
 * @author Bosmo
 */
public class MemberControl {
    public void EditMember(Member member){};
    public void DeleteMember (Member member){};
    public static void AddMember (int member, String nama, String hp, String email){
        Member.addMember(member, nama, hp, email);
    };
}
