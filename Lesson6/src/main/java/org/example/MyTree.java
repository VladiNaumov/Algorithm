package org.example;

import java.util.Stack;

public class MyTree<E extends Comparable<? super E>> implements ITree<E> {

   // служебный класс цель которого, что бы мы могли вернуть из метода более одного значения
    private class NodeAndParent {
        private Node<E> current;
        private Node<E> parent;

        public NodeAndParent(Node<E> current, Node<E> parent) {
            this.current = current;
            this.parent = parent;
        }
    }

    private int size;

    //элемент нашего дерева
    private Node<E> root;


    // операция добовления элемента
    @Override
    public boolean add(E value) {
        Node<E> node = new Node<>(value);

        NodeAndParent nodeAndParent = doFind(value);
        if (nodeAndParent.current != null) {
            return false;
        }

        Node<E> previous = nodeAndParent.parent;
        if (previous == null) {
            root = node;
        } else if (previous.isLeftChild(value)) {
            previous.setLeftChild(node);
        } else {
            previous.setRightChild(node);
        }

        size++;
        return true;
    }


    //метод операции поиска
    @Override
    public boolean contains(E value) {
        NodeAndParent nodeAndParent = doFind(value);
        return nodeAndParent.current != null;
    }

    //служебный метод поиска элемента
    private NodeAndParent doFind(E value) {
        Node<E> current = root;
        Node<E> previous = null;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return new NodeAndParent(current, previous);
            }

            previous = current;
            if (current.isLeftChild(value)) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }

        // спомощью нашего внутреннего класса мы возвращаем два значния
        return new NodeAndParent(null, previous);
    }

    //удаляем элемент
    @Override
    public boolean remove(E value) {
        //сначало убеждаемся что элемент у нас присутсвует
        NodeAndParent nodeAndParent = doFind(value);
        Node<E> removedNode = nodeAndParent.current;
        Node<E> parentNode = nodeAndParent.parent;

        if (removedNode == null) {
            return false;
        }

        if (removedNode.isLeaf()) {
            removeLeafNode(removedNode, parentNode);
        } else if (removedNode.hasOnlyOneChild()) {
            removeNodeWithOnlyOneChild(removedNode, parentNode);
        } else {
            removeNodeWithAllChildren(removedNode, parentNode);
        }

        size--;
        return true;
    }

    //служебный метод для удаление элемента
    private void removeNodeWithAllChildren(Node<E> removedNode, Node<E> parentNode) {
        Node<E> successor = getSuccessor(removedNode);
        if (removedNode == root) {
            root = successor;
        } else if (parentNode.isLeftChild(removedNode.getValue())) {
            parentNode.setLeftChild(successor);
        } else {
            parentNode.setRightChild(successor);
        }

        successor.setLeftChild(removedNode.getLeftChild());
    }

    //служебный метод
    private Node<E> getSuccessor(Node<E> removedNode) {
        Node<E> successor = removedNode;
        Node<E> successorParent = null;
        Node<E> current = removedNode.getRightChild();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if (successor != removedNode.getRightChild() && successorParent != null) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(removedNode.getRightChild());
        }

        return successor;

    }

    //служебный метод для удаления
    private void removeNodeWithOnlyOneChild(Node<E> removedNode, Node<E> parentNode) {
        Node<E> childNode = removedNode.getLeftChild() != null
                ? removedNode.getLeftChild()
                : removedNode.getRightChild();

        if (removedNode == root) {
            root = childNode;
        } else if (parentNode.isLeftChild(removedNode.getValue())) {
            parentNode.setLeftChild(childNode);
        } else {
            parentNode.setRightChild(childNode);
        }
    }

    //служебный метод для удаления
    private void removeLeafNode(Node<E> removedNode, Node<E> parentNode) {
        if (removedNode == root) {
            root = null;
        } else if (parentNode.isLeftChild(removedNode.getValue())) {
            parentNode.setLeftChild(null);
        } else {
            parentNode.setRightChild(null);
        }
    }

    // метод реалезующий обход по дереву (передаём сюда enum)
    @Override
    public void traverse(TraverseMode mode) {
        switch (mode) {
            case IN_ORDER -> inOrder(root);
            case PRE_ORDER -> preOrder(root);
            case POST_ORDER -> postOrder(root);
            default -> throw new IllegalArgumentException("Unknown traverse mode: " + mode);
        }
    }

    //служебный метод
    private void inOrder(Node<E> current) {
        if (current == null) {
            return;
        }

        inOrder(current.getLeftChild());
        System.out.println(current.getValue());
        inOrder(current.getRightChild());
    }

    //служебный метод
    private void preOrder(Node<E> current) {
        if (current == null) {
            return;
        }

        System.out.println(current.getValue());
        preOrder(current.getLeftChild());
        preOrder(current.getRightChild());
    }

    //служебный метод
    private void postOrder(Node<E> current) {
        if (current == null) {
            return;
        }

        postOrder(current.getLeftChild());
        postOrder(current.getRightChild());
        System.out.println(current.getValue());
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size;
    }


    // данный метод красиво ввыводит дерево со своими дочерними элементами
    @Override
    public void display() {
        Stack<Node<E>> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 64;

        boolean isRowEmpty = false;
        System.out.println("................................................................");

        while (!isRowEmpty) {
            Stack<Node<E>> localStack = new Stack<>();

            isRowEmpty = true;
            for (int i = 0; i < nBlanks; i++) {
                System.out.print(" ");
            }

            while (!globalStack.isEmpty()) {
                Node<E> tempNode = globalStack.pop();
                if (tempNode != null) {
                    System.out.print(tempNode.getValue());
                    localStack.push(tempNode.getLeftChild());
                    localStack.push(tempNode.getRightChild());
                    if (tempNode.getLeftChild() != null || tempNode.getRightChild() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();

            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }

            nBlanks /= 2;
        }
        System.out.println("................................................................");
    }
}
