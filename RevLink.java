public class RevLink{
    Node head;
    class Node{
        String data;
        Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
    }
    public void add(String data){
     Node newNode = new Node(data);
        if(head == null ){
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
        Node currNode = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(currNode != null){
              System.out.print(currNode.data + "-->");
              currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void reverseIterate() {
        if(head == null || head.next == null){
            return;
        }
            Node preNode = head;
            Node currNode = head.next;
          while(currNode != null){
            Node nextNode = currNode.next;
                 currNode.next = preNode;// change the link --> from to <--
            // update
            preNode = currNode;
           currNode = nextNode;
           
          }
          head.next = null;
          head = preNode;
    }
    public  Node reverseRecursive(Node head) {
         if(head == null || head.next == null){
            return head;
         }
       Node newHead = reverseRecursive(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
    }
        public static void main(String[] args) {
            RevLink list = new RevLink();
              // list.add("1");
            //    list.add("2");
            //    list.add("3");
            //    list.add("4");
            //    list.print();
            //    list.reverseIterate();
            //    list.print();
            list.head = list.reverseRecursive(list.head);
            list.print();
        } 
}