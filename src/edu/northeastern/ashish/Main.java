package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11};
        SegTree tree = new SegTree(arr);

        int val = tree.getSumInRange(1,4);

        tree.update(2, 8);

        val = tree.getSumInRange(1,4);

        System.out.printf("test");
    }


}
