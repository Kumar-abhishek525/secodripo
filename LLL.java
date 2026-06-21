public class LLL{
       Node head;
       private int size;
       LLL(){
        this.size = 0;
       }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = next;
            size++;
        }
    }
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
               if(head == null){
                 head = newNode;
                 return;
               }
               newNode.next = head;
               head = newNode;
    }
    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
             if(head == null){
                head = newNode;
                return;
             }
             Node currNode = head;
             while(currNode.next != null){
                currNode = currNode.next;
             }
              currNode.next =newNode;
    }
    // print
      public void print(){
         Node currNode = head;
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
      }
      // delete first
      public void deleteFirst(){
        if(head == null){
          System.out.println("list is empty");
          return;
        }
        size--;
      //  Node currNode = head;
      //   head = currNode.next;
            head = head.next;
      }
      //delete last
       public void deleteLast() {
           if(head == null){
            System.out.print("list is empty");
               return;
           }
           size--;
           if(head.next == null) {
                  head = null;
                  return;
           }
           Node secondLast = head;
           Node lastNode = head.next;
           while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
           }
           secondLast.next = null;
       }
       public int getSize(){
        return size;
       }

    public static void main(String[] args){
               LLL list = new LLL();
                  list.addFirst("abhishek");
                  list.print();
                  list.addLast("kumar");
                  list.print();
                // list.deleteFirst();
                list.deleteLast();
                 list.print();
                 System.out.println(list.getSize());
                 list.addLast("engineer");
                 System.out.println(list.getSize());

  
}
}