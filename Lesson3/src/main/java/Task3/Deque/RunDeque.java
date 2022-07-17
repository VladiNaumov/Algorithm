package Task3.Deque;



public class RunDeQue {
    public static void main(String[] args) {

        //TASK 2
        DequeImpl<Integer> deq = new DequeImpl<>(6);

        insertRight(deq, 1);
        insertRight(deq, 2);
        insertRight(deq, 3);
        insertRight(deq, 4);// 1 2 3 4
        insertLeft(deq, 5); // 5 1 2 3 4
        insertLeft(deq, 6); // 6 5 1 2 3 4

        removeLeft(deq); //5 1 2 3 4
        removeRight(deq); // 5 1 2 3

        displayLeftToRight(deq); // Queue
      // displayRightToLeft(deq); //Stack
    }

    private static <T> void insertRight(IMaster<T> deq, T value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <T> void insertLeft(IMaster<T> deq, T value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <T> void removeRight(IMaster<T> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <T> void removeLeft(IMaster<T> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <T> void displayRightToLeft(IMaster<T> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <T> void displayLeftToRight(IMaster<T> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}