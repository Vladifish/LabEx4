/*
 * Authors: Aaron Jetro A. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: Binary Tree
 */
public class BT<T> {
    BTNode<T> root;
    int height;

    BT() {
        root = null;
        // the height of an empty tree is still 0
    }

    public void setRoot(BTNode<T> n) {
        root = n;
    }

    public static void main(String[] args) {
        BT<Integer> a = new BT<>();
        System.out.println(a.height);
    }
}
