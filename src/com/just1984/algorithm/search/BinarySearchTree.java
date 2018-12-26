package com.just1984.algorithm.search;

import java.util.LinkedList;

public class BinarySearchTree<K extends Comparable<K>, V> {

    private Node<K, V> root;
    private int count;

    public BinarySearchTree() {
        this.root = null;
        this.count = 0;
    }

    private static class Node<K, V> {
        private K key;
        private V val;
        private Node<K, V> left;
        private Node<K, V> right;
        private Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(K key, V val) {
        root = insert(root, key, val);
    }

    public V search(K key) {
        return search(root, key);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    public K min() {
        return min(root).key;
    }

    public K max() {
        return max(root).key;
    }

    public void levelOrder() {
        LinkedList<Node<K, V>> linkedList = new LinkedList<>();
        linkedList.addLast(root);
        while (!linkedList.isEmpty()) {
            Node<K, V> node = linkedList.removeFirst();
            System.out.println(node.key);
            if (node.left != null) {
                linkedList.addLast(node.left);
            }
            if (node.right != null) {
                linkedList.addLast(node.right);
            }
        }
    }

    public void removeMin() {
        if (root != null) {
            root = removeMin(root);
        }
    }

    public void removeMax() {
        if (root != null) {
            root = removeMax(root);
        }
    }

    public void remove(K key) {
        root = remove(root, key);
    }

    private Node<K, V> insert(Node<K, V> node, K key, V val) {
        if (node == null) {
            node = new Node<>(key, val);
            count++;
        }
        if (key.compareTo(node.key) == 0) {
            node.val = val;
        } else if (key.compareTo(node.key) < 0) {
            node.left = insert(node.left, key, val);
        } else {
            node.right = insert(node.right, key, val);
        }
        return node;
    }

    private V search(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) == 0) {
            return node.val;
        } else if (key.compareTo(node.key) < 0) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    private void preOrder(Node<K, V> node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private void inOrder(Node<K, V> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }

    private void postOrder(Node<K, V> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }

    private Node<K, V> min(Node<K, V> node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    private Node<K, V> max(Node<K, V> node) {
        if (node.right == null) {
            return node;
        }
        return max(node.right);
    }

    private Node<K, V> removeMin(Node<K, V> node) {
        if (node.left == null) {
            count--;
            return node.right;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private Node<K, V> removeMax(Node<K, V> node) {
        if (node.right == null) {
            count--;
            return node.left;
        }
        node.right = removeMax(node.right);
        return node;
    }

    private Node<K, V> remove(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            return node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            return node;
        } else {
            if (node.left == null) {
                count--;
                return node.right;
            }
            if (node.right == null) {
                count--;
                return node.left;
            }
            Node<K, V> successor = min(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            return successor;
        }
    }
}
