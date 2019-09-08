import org.junit.Test;
import org.junit.Assert.*;

public class TestMTBT {
    public static MTBT.TreeNode generateTree_1() {
        MTBT.TreeNode root = new MTBT.TreeNode(1);
        root.left = new MTBT.TreeNode(3);
        root.right = new MTBT.TreeNode(2);
        root.left.left = new MTBT.TreeNode(5);
        return root;
    }

    public MTBT.TreeNode generateTree_2() {
        MTBT.TreeNode root = new MTBT.TreeNode(2);
        root.left = new MTBT.TreeNode(1);
        root.right = new MTBT.TreeNode(3);
        root.left.right = new MTBT.TreeNode(4);
        root.right.right = new MTBT.TreeNode(7);
        return root;
    }

    @Test
    public void testMTBT() {
        MTBT.TreeNode expected = MTBT.mergeTrees(generateTree_1(), generateTree_2());
        preOrder(expected);
    }

    public void preOrder(MTBT.TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}
