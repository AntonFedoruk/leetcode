package ua.java.dsa.tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)),
                                new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52)))
                );

//        System.out.println("Tree sum: " + root.sumRecursive());
//        System.out.println("Tree sum: " + root.sumDeep());
        System.out.println("Tree sum: " + root.sumWide());
    }
}