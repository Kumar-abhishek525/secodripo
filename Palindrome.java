public class Palindrome{
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
               return ;
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
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("null");
      }
      public Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            while(curr.next != null){
                Node nextNode  =  curr.next;
                 curr.next = prev;   
            prev = curr;
            curr = nextNode;
            }
            return prev;
      }
      public Node findMiddle(Node head){
          Node hare = head;
          Node turtle = head;
          while(hare.next != null && hare.next.next != null){
               turtle = turtle.next;
               hare = hare.next.next;
          }
          return turtle;
      }
      public boolean isPalindrome(Node head){
        // first case if linked list is empty or one element
        if(head == null || head.next == null){
            return true;
        }
        // 1.find middle node
        Node middle = findMiddle(head);
        //2. reverse the list from second half
        Node secondHalfStart = reverse(middle.next);
       Node firstHalfStart = head;
       while(secondHalfStart.next != null){
           if(firstHalfStart.data != secondHalfStart.data){
                 return false;
           }
             firstHalfStart = firstHalfStart.next;
             secondHalfStart = secondHalfStart.next;
       } 
          return true;
      }
      public static void main(String[] args){
        Palindrome pl = new Palindrome();
        pl.add(1);
        pl.add(2);
        pl.add(2);
        pl.add(1);
        pl.print();
        boolean result = pl.isPalindrome(pl.head);// pass head node
        System.out.println("Is a palindrome" +  result);
      }
}