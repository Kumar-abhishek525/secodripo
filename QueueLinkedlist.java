public class QueueLinkedlist{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
     }
       static class Queue{
        static Node head = null;
        static Node tail = null;

     public static boolean isEmpty(){
        return head == null && tail == null;
     }
     // addd operation 
    public static void add(int data){
        Node newNode = new Node(data);
          if(tail == null){
             tail = head = newNode;  
             return ;
          }
          tail.next = newNode;
          tail = newNode;
    }  
    // remove operation
    public static int remove(){
        if(head == null && tail == null){
            System.out.print("queue is empty so element can not be delete");
            return -1;
        }
               int front = head.data;
               if(head == tail){
                tail = null;
               }
                head = head.next;
                return front;
    }   
    // peek funcation
    public static int peek(){
        if(isEmpty()){
            System.out.print("queue is empty");
            return -1;
        }
        // int front = head.data
        // head = head.next;
        // return front;
        return head.data;
    }
   
} 
    public static void main(String[] args){
        // QueueLinkedlist qli = new QueueLinkedlist();
        Queue qli = new Queue();
        qli.add(2);
        qli.add(5);
        qli.add(10);
            qli.add(20);
            while(!qli.isEmpty()){
                System.out.println(qli.peek());
                 qli.remove();
            }
        }
  }
