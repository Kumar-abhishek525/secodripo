public class LinkedListCycle{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
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
    public void print(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
              System.out.print(currNode.data + "--> ");
              currNode = currNode.next;
        }
        System.out.print("null");
    }
    public void deleteFirst(){
          if(head == null){
            System.out.print("list is empty");
            return;  
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null|| head.next == null){
            System.out.print("list is empty");
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;
        while( LastNode.next != null){
            secondLast = secondLast.next;
            LastNode = LastNode.next; 
        }
        secondLast.next = null;
    }
    public boolean isCycle(Node head){
        Node fast = head; // hare node
        Node slow = head; // turtle node
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        LinkedListCycle  list = new LinkedListCycle();
                list.add(4);
                list.add(5);
                list.add(8);
                list.print();
                list.deleteFirst();
               list.deleteLast();
               list.print();
    }
}