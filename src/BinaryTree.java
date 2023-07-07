public class BinaryTree {
    class Node{
        int data;
        Node right;
        Node left;

        Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root = null;

    void insert(int data)
    {
        root = insertroot(root,data);
    }
    public Node insertroot(Node root, int data)
    {
        Node newnode1 = new Node(data);
        if(root==null)
        {
            root = newnode1;
            return root;
        }
        else{
            if(root.data>data)
            {
                root.left = insertroot(root.left,data);
            }
            else{
                root.right = insertroot(root.right,data);
            }
        }
        return root;
    }

    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public int height(Node root)
    {
        int ldepth =0;
        int rdepth = 0;
        if(root==null)
        {
            return 0;
        }else {
            ldepth = height(root.left);
            rdepth = height(root.right);
        }
        if(ldepth>rdepth)
        {
            return (ldepth+1);
        }
        return (rdepth+1);
    }

    public static void main(String[] args) {
        BinaryTree bb = new BinaryTree();
        bb.insert(20);
        bb.insert(10);
        bb.insert( 5);
        bb.insert( 15);
        bb.insert( 30);
        bb.insert( 25);
        bb.insert( 35);
        //bb.insertroot(bb.root,18);
        System.out.println("Inorder:");
        bb.inorder(bb.root);
        System.out.println("");
        System.out.println("Postorder:");
        bb.postorder(bb.root);
        System.out.println("");
        System.out.println("Preorder:");
        bb.preorder(bb.root);
        System.out.println("");
        System.out.println("Height:");
        System.out.println(bb.height(bb.root));
    }
}
