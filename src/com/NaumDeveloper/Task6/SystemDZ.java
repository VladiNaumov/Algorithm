package com.NaumDeveloper.Task6;

import java.util.Random;

public class SystemDZ {

    Random rand = new Random();
    int treeCount = 20;
    int maxLevel = 4;
    int nodeCount = (int) (Math.pow(2, maxLevel) - 1);
    int maxValue = 25;// [-25; 25]
    int balancedTreeCount = 0;
    boolean treeView = false;

    public void random(){

        for (int i = 0; i < treeCount; i++) {
            ITree<Integer> theTree = new MyITree<>(maxLevel);
            initTree(rand, nodeCount, maxValue, theTree);
            if (theTree.isBalanced()) {
                balancedTreeCount++;
                if (!treeView) {
                    treeView = true;
                    theTree.display();
                }
            }
        }

        System.out.println("Balanced Tree Count = " + ((balancedTreeCount / (treeCount * 1.0)) * 100) + "%");
    }


    private static void initTree(Random rand, int nodeCount, int maxValue, ITree<Integer> theTree) {
        for (int j = 0; j < nodeCount; j++) {
            theTree.add(rand.nextInt(maxValue * 2 + 1) - maxValue);// [-25; 25]
        }
    }

}
