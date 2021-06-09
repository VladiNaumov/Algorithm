package com.NaumDeveloper.lesson6;

public class Test6 {

    public static void main(String[] args) {
        ITree<Integer> ITree = new MyTree<>();
        ITree.add(60);
        ITree.add(50);
        ITree.add(66);
        ITree.add(40);
        ITree.add(55);
        ITree.add(70);
        ITree.add(31);
        ITree.add(45);
        ITree.add(42);
        ITree.add(43);
        ITree.add(67);
        ITree.add(81);

        System.out.println("Find 70: " + ITree.contains(70));
        System.out.println("Find 700: " + ITree.contains(700));

//        tree.traverse(Tree.TraverseMode.IN_ORDER);

        ITree.display();
//        tree.remove(55);
//        tree.remove(42);
        ITree.remove(40);
        ITree.display();
    }
}
