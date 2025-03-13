import java.util.*;

public class MemberManage {
    BSTRun memberList = new BSTRun();

    public void addMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNum = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter member ID: ");
        String memberID = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        MemberData data = new MemberData(firstName, lastName, phoneNum, email, address, memberID, password);
        String treeData = data.toString();
        memberList.insertTree(treeData); //insertT() method, resolve type issues?
    }
    public void deleteMember() {
        Scanner input = new Scanner(System.in);
        if (memberList.isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.print("Enter Member ID: ");
        String treeData = input.nextLine();
       
        memberList.deleteTree(treeData); 
    }
    public void searchMember() {
        Scanner input = new Scanner(System.in);
        if (memberList.isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.print("Enter Member ID: ");
        String treeData = input.nextLine();
        memberList.searchTree(treeData);

    }
    public void listMember() {
        Scanner input = new Scanner(System.in);
        if (memberList.isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.print("Select sorting method: 1. Inorder 2. Preorder 3. Postorder: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                memberList.inorder();
                break;
            case 2:
                memberList.preorder();
                break;
            case 3:
                memberList.postorder();
                break;
            default:
                System.out.println("Invalid choice");
            
        }
    }
}

