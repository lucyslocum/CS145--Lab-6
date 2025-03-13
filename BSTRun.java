public class BSTRun {
    private BSTNode root;
    public BSTRun() {
        root = null;
    }
    public Boolean insertT(String treeData) {
        if (root == null) {
            root = new BSTNode(treeData);
        }
        else {
            BSTNode parent = null;
            BSTNode current = root;
            while (current != null) {
                if (treeData.compareTo(current.treeData) < 0) {
                    parent = current;
                    current = current.left;
                }
                else if (treeData.compareTo(current.treeData) > 0) {
                    parent = current;
                    current = current.right;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public Boolean searchT(String treeData){
        BSTNode current = root;
        while (current != null) {
            if (treeData.compareTo(current.treeData) < 0) {
                current = current.left;
            }
            else if (treeData.compareTo(current.treeData) > 0) {
                current = current.right;
            }
            else {
                System.out.println("Member found");
                return true;
            }
        }
        System.out.println("Member not found");
        return false;
    }
    public Boolean deleteT(String treeData) {
        BSTNode parent = null;
        BSTNode current = root;
        while (current != null) {
            if (treeData.compareTo(current.treeData) < 0) {
                parent = current;
                current = current.left;
            }
            else if (treeData.compareTo(current.treeData) > 0) {
                parent = current;
                current = current.right;
            }
            else {
                break;
            }
        }
            if (current == null) {
                return false;
            }
            if (current.left == null) {
                if (parent == null) {
                    root = current.right;
                }
                else {
                    if (treeData.compareTo(parent.treeData) < 0) {
                        parent.left = current.right;
                    }
                    else {
                        parent.right = current.right;
                    }
                }
            }
            else {
                BSTNode parentOfRightMost = current;
                BSTNode rightMost = current.left;
                while (rightMost.right != null) {
                    parentOfRightMost = rightMost;
                    rightMost = rightMost.right;
                }
                current.treeData = rightMost.treeData;
                if (parentOfRightMost.right == rightMost) {
                    parentOfRightMost.right = rightMost.left;
                }
                else {
                    parentOfRightMost.left = rightMost.left;
                }
            }
        
        return true;
    }
    public void inorderT(BSTNode root) {
    if (root == null) {
        return;
    }
    else {
        inorderT(root.left);
        System.out.print(root.treeData + " ");
        inorderT(root.right);
        }
    }
    public void preorderT(BSTNode root) {
        if (root == null) {
            return;
        }
        else {
            System.out.print(root.treeData + " ");
            preorderT(root.left);
            preorderT(root.right);
        }
    }
    public void postorderT(BSTNode root) {
        if (root == null) {
            return;
        }
        else {
            postorderT(root.left);
            postorderT(root.right);
            System.out.print(root.treeData + " ");
        }
    } 
    public void insertTree(String treeData) {
         insertT(treeData);
    }
    public void deleteTree(String treeData) {
       deleteT(treeData);
    }
    public void searchTree(String treeData) {
        searchT(treeData);
    }
    public void inorder() {
        inorderT(root);
    }
    public void preorder() {
        preorderT(root);
    }
    public void postorder() {
        postorderT(root);
    }
    public Boolean isEmpty() {
        return root == null;
    }
 }