package Task3.Stack;


public class RunStack {

    public static void main(String[] args) {

        //testStack();
        TaskRevers();

    }

    private static void testStack() {
        MyStack<Integer> stack = new MyStack<>(5);


        System.out.println("Add value 1: " + addToStack(stack, 1));
        System.out.println("Add value 2: " + addToStack(stack, 2));
        System.out.println("Add value 3: " + addToStack(stack, 3));
        System.out.println("Add value 4: " + addToStack(stack, 4));
        System.out.println("Add value 5: " + addToStack(stack, 5));
        System.out.println("Add value 6: " + addToStack(stack, 6));

        System.out.println("Наличие элементов в стеке " + stack);

        System.out.println("Размер стека (Stack size): " + stack.size());
        System.out.println("Чтение элемента с вершины (Stack peek) : " + stack.peek());
        System.out.println("Удаление элемента (Stack pop): " + removeFromStack(stack));
        System.out.println("Чтение элемента с вершины (Stack peek) : " + stack.peek());



        System.out.println("Производим очищения стека: ");
        System.out.println("Наличие элементов в стеке " + stack);
        System.out.println("Размер стека (Stack size): " + stack.size());

        //Производим очищения стека
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    // утилитный метод для удаления элементов из стека он проверят действительно ли стек не является пустым
    private static Integer removeFromStack(MyStack<Integer> stack) {
        return !stack.isEmpty() ? stack.pop() : null;
    }

    // утилитный метод для проверки свободного места в стеке. Он сообщат был ли добавлен элемент или нет
    private static boolean addToStack(MyStack<Integer> stack, Integer value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }

        return false;
    }

    public static void TaskRevers(){
        String str = "TervetuloaSuomeen";

        System.out.println(str);
        MyStack<Character> st = new MyStack<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        while ( !st.isEmpty() ) {
            System.out.print(st.pop());
        }


        System.out.println();

        if (true) {
            return;
        }


    }

    public void reverStrinBilder(String revers){

        System.out.println(new StringBuilder(revers).reverse());
    }
}
