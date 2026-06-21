 public class Tree{
   static  int idx = -1;
    static class Node{
    int  data;
    Node left;
    Node right;
      Node(int data){
        this.data = data;
        this.left = null ;
        this.right = null;
      }
    }
    // public static Node buildTree(int[] nodes){
    //     idx = -1;
    //     return build(nodes);
    // }
     public static Node  buildTree(int[] nodes){
           idx++;
           if(nodes[idx] == -1){
              return null;
           }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
     }

    public static void main(String[] args){
                   Tree tr = new Tree();
                 int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
                 idx = -1;
                 Node root = tr.buildTree(nodes);
                 System.out.print((root.left).data+" "); 
                int[] node = {1,2,4,-1,-1,-1,-1};
                idx = -1;
                Node root1 = tr.buildTree(node);
                System.out.print(root1.data+" ");    
    }       
 }