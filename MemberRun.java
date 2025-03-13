import java.util.*;

public class MemberRun {
    
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner input = new Scanner(System.in);
        MemberManage memberTable = new MemberManage();
        String choiceT;
         do {   
            System.out.println("Enter A to add an entry");
            System.out.println("Enter D to delete an entry");
            System.out.println("Enter S to search entries");
            System.out.println("Enter L to list entries");
            System.out.println("Enter Q to quit");
            System.out.print("Enter your choice: ");
            choiceT = input.next();
            if (choiceT.equals("A")) {
                memberTable.addMember();
            }
            else if (choiceT.equals("D")) {
                memberTable.deleteMember();
            }
            else if (choiceT.equals("S")) {
                memberTable.searchMember();
            }
            else if (choiceT.equals("L")) {
                memberTable.listMember();
            }
            else if (choiceT.equals("Q")) {
                return;
            }
            else {
                System.out.println("Invalid choice.");
            }
        } while (choiceT != "Q");
    }
}
