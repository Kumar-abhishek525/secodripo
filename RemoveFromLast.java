import java.util.Scanner;
public class RemoveFromLast{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        // add Last
        public void add( int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }   
       Node currNode = head;
       while(currNode.next != null){
        currNode = currNode.next;
       }
         currNode.next = newNode;
        }
     // print
     public void print(){
        if(head == null){
            System.out.print("list is empty");
              return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
             currNode = currNode.next;
        }
        System.out.println("null");
    }
    public Node removefromlast(Node head,int n){
        if(head.next == null){
            return head;
        }
        int size = 1;
        //size
        Node currNode = head;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }
        if(n==size){
            return head.next;
        }
        int indexTosearch = size - n;
        int i = 0;
        // prev Node
       Node prev = head;
          while(i < indexTosearch-1){
            prev = prev.next;
            i++;
          }
          prev.next = prev.next.next;
          return head;
    }
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();  
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int n = sc.nextInt();
            RemoveFromLast rfl = new RemoveFromLast();
                rfl.add(a);
                rfl.add(b);
                rfl.add(c);
                rfl.add(d);
                rfl.add(e);
                rfl.print();
                rfl.head = rfl.removefromlast(rfl.head,n);
                rfl.print();
         }
}