/*
 * Authors: Aaron Jetro A. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: Binary Tree Node
 */

class BTNode<T> {
    T info;
    int level;
    BTNode<T> left;
    BTNode<T> right;

    public BTNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    // set null as the parameter for the right/left node if there's just one child
    public BTNode(T info, BTNode<T> left, BTNode<T> right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        if (info == null)
            return "";
        String s = "[K=" + info;
        if (left != null || right != null) {
            if (left != null) {
                s += " ";
                s = s + "L=" + left.toString() + ""; // I think the toString is unnecessary
            }
            if (right != null) {
                s += " ";
                s = s + "R=" + right.toString() + "";
            }
        }
        return s + "]";
    }

    // DELETE LATER
    // public static void main(String[] args) {
    // BTNode<Integer> A = new BTNode<>(1);
    // System.out.println(A);
    // BTNode<Integer> B = new BTNode<>(1, A, A);
    // System.out.println(B);
    // BTNode<Integer> C = new BTNode<>(3, B, A);
    // System.out.println(C);
    // }
}