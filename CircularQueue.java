public class CircularQueue{
        static class Circular{
             static int[] arr;
             static int size;
             static int rear = -1;
             static int front = -1;
        Circular(int n){
            this.size = n;
            arr = new int[n];
        }
        // is empty or  not
        public static boolean isEmpty(){
             return rear == -1 && front == -1;
        }
        // is full or not
        public static boolean isFull(){
            return front   == (rear+1)%size;
        }
        // ADD ELEMETN IN CIRCULAR QUEEU
        public static void add(int data){
            if(front == (rear+1)%size){
             System.out.print("queue is full or over flow");
             return ;
            }
            // 1st element is add
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        // remove data from ciucular queue
        public static int remove(){
            if(isEmpty()){
                System.out.print("queue is empty");
                return -1;
            }
            int result = arr[front];
            // single element condition
            if(rear == front){
               rear = front = -1; 
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        // PEEK 
        public static int peek(){
            if(isEmpty()){
                System.out.print("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
        public static void main(String[] args){
              Circular cq = new Circular(10);
            //  CircularQueue cq= new CircularQueue();
             cq.add(1);
             cq.add(2);
             cq.add(3);
             cq.add(4);
             while(!cq.isEmpty()){
                System.out.println(cq.peek());
                cq.remove();
             }
  }
}
