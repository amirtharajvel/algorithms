package union_find;

public class TestUnionFind {

    public static void main(String[] args) {
        int[] id = {1,2,3,4,5,6,7,8,9,10};
        QuickFindUF tf = new QuickFindUF(10);
        tf.union(4,3);
        tf.union(3,8);
        tf.union(6,5);
        System.out.println(tf.connected(4,3));
        System.out.println(tf.connected(3,8));
        System.out.println(tf.connected(4,8));
        System.out.println(tf.connected(6,5));
        System.out.println(tf.connected(1,2));
    }
}
