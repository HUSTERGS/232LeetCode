class  MTBT {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        TreeNode retTree;
        if (t1 != null && t2 != null) {
            retTree = new TreeNode(t1.val + t2.val);
            retTree.left = mergeTrees(t1.left, t2.left);
            retTree.right = mergeTrees(t1.right, t2.right);
        } else if (t1 == null && t2 != null) {
            retTree = new TreeNode(t2.val);
            retTree.left = mergeTrees(null, t2.left);
            retTree.right = mergeTrees(null, t2.right);
        } else {
            retTree = new TreeNode(t1.val);
            retTree.left = mergeTrees(t1.left, null);
            retTree.right = mergeTrees(t1.right, null);
        }

        return retTree;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

