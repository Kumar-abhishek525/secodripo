public class Queue{
      static class ArrQueue{
        static int[] arr ;
        static int size;
        static int rear = -1;
       ArrQueue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            // if(rear == -1){
            //     return true;
            // }
            // return false;
            return rear == -1;
        }
        // ADD A ELEMENT IN QUEUE or enqueue
        public static void add(int data){
           if(rear == size -1){
                 System.out.print("stack is full or overflow");
                 return ;  
           }
           rear = rear + 1;
           arr[rear] = data;
        }
        // REMOVE ELEMENT OR DEQUEUW=E
        public static int remove(){
             if(isEmpty()){
                System.out.print("queue  is empty or queue is under floew");
                return -1;
             }
             int front = arr[0];
            for(int i = 0 ; i < rear ; i++) {
                 arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        // peek 
        public static int peek(){
            if(isEmpty()){
                System.out.print("queue is empty ");
                return -1; 
            }
            return  arr[0]; 
        }
    } 

    public static void main(String[] args){
        Queue  k = new Queue();
     ArrQueue q = new ArrQueue(10);
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }

    }
}
