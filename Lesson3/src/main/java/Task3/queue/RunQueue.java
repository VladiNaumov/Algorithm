package Task3.queue;

public class RunQueue {
    public static void main(String[] args) {

        testQueue();
        testPriorityQueue();
    }

    private static void testQueue() {


        IQueue<Integer> queue = new Queue<>(5);
        System.out.println("Add value 1: " + queue.insert(3));
        System.out.println("Add value 2: " + queue.insert(5));
        System.out.println("Add value 3: " + queue.insert(1));
        System.out.println("Add value 4: " + queue.insert(2));
        System.out.println("Add value 5: " + queue.insert(6));
        System.out.println("Add value 6: " + queue.insert(4));

        System.out.println("Наличие элементов в очереди " + queue.toString());

        System.out.println("метка начала очереди: " + queue.peekFront());

        System.out.println("метка конеца очереди: " + queue.peekTeil());

        System.out.println("удаление элемента " + queue.remove());


        System.out.println("Наличие элементов в очереди " + queue.toString());

        System.out.println("Add value " + queue.insert(4));

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());


        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }



        System.out.println("Наличие элементов в очереди " + queue.toString());

     }

     public static void testPriorityQueue(){
         IQueue<Integer> PriorityQueue = new PriorityQueue<>(5);

         System.out.println(PriorityQueue.insert(3));
         System.out.println(PriorityQueue.insert(5));
         System.out.println(PriorityQueue.insert(1));
         System.out.println(PriorityQueue.insert(2));
         System.out.println(PriorityQueue.insert(6));
         System.out.println(PriorityQueue.insert(4));


         System.out.println("чтение элемента каторый у нас первый в очереди (тоесть первый кондидат на удаление (Queue peek): " + PriorityQueue.peekFront());
         System.out.println(PriorityQueue.remove());

         System.out.println("Наличие элементов в очереди " + PriorityQueue);

         System.out.println("Queue size: " + PriorityQueue.size());
         System.out.println("Queue is full: " + PriorityQueue.isFull());

         while (!PriorityQueue.isEmpty()) {
             System.out.println(PriorityQueue.remove());
         }

     }


}
