 import java.util.ArrayList;
 public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // INSERTATION IN BST
    public static Node insert(Node root, int val){
        if(root == null){
               root = new Node(val);
              return root;    
        }
        if(root.data > val){
            // left sub tree
             root.left = insert(root.left , val);
        }else{
            // insert in right subtree
           root.right = insert(root.right , val);
        }
        return root; 
    }
    // inorder traversal of tree
    public static void inorder(Node root){
          if(root == null){
            return ;
          }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // SEARCH ELEMENT IN BST
    public static boolean search(Node root, int ele){
                if(root == null){
                    return false; 
                }
             if(root.data == ele){
                return true;
             }
           else if(root.data > ele){
              return    search(root.left,ele);
             }
             else{
              return  search(root.right,ele);
             }

    }
    // delection in Bst
    public static Node delete(Node root , int ele){
                 // case 1
           if(root.data > ele){
               root.left = delete(root.left,ele);
           }
           else if(root.data < ele){
                    root.right =  delete(root.right ,ele);
           }
           else{// root.data == ele
                 // casse :1
                 if(root.left == null && root.right == null){
                              return null;
                 } 
                 // case :2
                 if(root.left == null){
                    return root.right;
                 }
               else  if(root.right == null){
                    return root.left;
                 }
                 //case:3 or find Inorder succecor of node
                   Node IS = inorderSuccessor(root.right);
                   root.data = IS.data;
                   root.right = delete(root.right , IS.data);    
           }
           return root;
    }
    public static Node inorderSuccessor(Node root){
               while(root.left != null){
                root = root.left; 
               }
               return root;
    }
    // Find the range
    public static void printrange(Node root,int x ,int y){
                   if(root == null){
                    return ;
                   }
                if(root.data >= x && root.data <= y){
                       printrange(root.left,x ,y);
                       System.out.print(root.data+" ");
                       printrange(root.right,x , y);
                   }
                   else if(root.data >= y){
                      printrange(root.left, x, y);
                   }
                   else{
                    printrange(root.right,x,y);
                   }
    }
    // print path
    public static void print(ArrayList<Integer> path){
          for(int i = 0; i< path.size(); i++){
            System.out.print(path.get(i)+"-->");
          }
          System.out.println();
    }
    // PRINT ROOT TO LEAF PATHS
    public static void printpath(Node root, ArrayList<Integer> list){
             if(root == null){
                return ;
             }
             list.add(root.data);
             // leaf node
             if(root.left == null && root.right == null){
                  print(list);
             }  
             else {
                printpath(root.left , list);
                printpath(root.right ,list);
             }  
             list.remove(list.size()-1);
    }

       public static void main(String[] args){{}
        //   int[] values = {5,1,3,4,2,7};
         int[] values = {8,5,3,1,4,6,10,11,14};

          Node root = null; 
     for(int i = 0; i < values.length; i++){
                   root = insert(root , values[i]);
     } 
            //  inorder(root);
            //  System.out.println();
    //   Scanner sc = new Scanner(System.in);
    //   int ele = sc.nextInt();

    //   if(search(root , ele)){
    //     System.out.println("element is found");
    //   }else{
    //     System.out.println("element is not found");
    //   }
            //  delete(root , 4);
            //  inorder(root);
            //  System.out.println();
    //  printrange(root , 2 , 15);    
    printpath(root , new ArrayList<Integer>());   

    }
 }