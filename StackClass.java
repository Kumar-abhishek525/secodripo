public class StackClass{
     static class Node{
        int data;
        Node next;
      public  Node(int data){
            this.data = data;
            this.next = null; 
        }
     }
     // stack implementation 
    static class Stack{
        public static Node head;
        // check stack is empty or not
        public  boolean isEmpty(){
            // if(head == null){
            //     return true;
            // }
            return head == null;
        }
        // push operation
      public  void push(int data){
        Node newNode = new Node(data);
          if(isEmpty()){
            head = newNode;
            return;
          }
          newNode.next = head;
          head = newNode;
      }
      // pop operatio
      public  int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
      }
      // peek operation or top of the stack
      public  int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
      }
    //   public static void print(){
    //     if(head == null){
    //          System.out.print("Stack is empty");
    //     }
    //     Node currNode = head;
    //     while(currNode != null){
    //         System.outprint(currNode.data +" ");
    //         currNode = currNode.next;
    //     }
    //   }
    }
    public static void main(String[] args){
                Stack sc  = new Stack();
                sc.push(1);
                sc.push(2);
                sc.push(3);
                sc.push(4);
                while(!sc.isEmpty()){
                System.out.println(sc.peek());
                sc.pop();
                }
    }
}