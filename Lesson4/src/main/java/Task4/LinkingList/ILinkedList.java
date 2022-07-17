package Task4.LinkingList;

public interface ILinkedList<E> extends Iterable<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    class Node<E> {
        E item;
        Node<E> next;
        Node<E> previous;

        public Node(E item, Node<E> next) {
            this(item, next, null);
        }

        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

    /*
    //Вставляем (добовляеи) элемент в начало списка
    void insertFirst(E value);

    //Удаление первого элемента из спика
    E removeFirst();

    //удалить элемент из списка (проверка наличие элементов в списке)
    boolean remove(E value);

    //отвечает за поиск елемента в списке
    boolean contains(E value);

    //размер списка
    int size();

    //проверка пустой ли список или нет
    boolean isEmpty();

    //Прочитать список и вывести его на экран
    void display();

    //получение первого элемента из списка
    E getFirst();

    // класс отвечающий за узел связывающего списка
    class Node<E> {
        //хранить данный
        E item;

       // хранит ссылку на следующий элемент
        Node<E> next;

        Node<E> previous;

        public Node(E item, Node<E> next) {
            this(item, next, null);
        }

        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

     */

}
