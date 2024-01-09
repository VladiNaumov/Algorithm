package ch06;

public class TestMaster {

    public static void main(String[] args) {
        ITree<Integer> myTree = new MyTree<>();
        myTree.add(60);
        myTree.add(50);
        myTree.add(66);
        myTree.add(40);
        myTree.add(55);
        myTree.add(70);
        myTree.add(31);
        myTree.add(45);
        myTree.add(42);
        myTree.add(43);
        myTree.add(67);
        myTree.add(81);

        System.out.println("Find 70: " + myTree.contains(70));
        System.out.println("Find 700: " + myTree.contains(700));

   //     MyTree.traverse(ITree.TraverseMode.IN_ORDER);

        myTree.display();
//        tree.remove(55);
//        tree.remove(42);
        myTree.remove(40);
        myTree.display();
    }
}
