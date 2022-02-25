import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
            this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
}

public class BTFromPreInOrderTraversal {
      // leet 105 =======================================================

      public TreeNode construct(int[] pre, int psi, int pei, int[] in, int isi, int iei) {
            if (psi == pei) {
                  return new TreeNode(pre[psi]);
            }

            if (psi > pei) {
                  return null;
            }

            TreeNode root = new TreeNode(pre[psi]);

            int find_ele = pre[psi];

            int idx = isi;

            while (in[idx] != find_ele) {
                  idx++;
            }

            int left_ele = idx - isi;

            root.left = construct(pre, psi + 1, psi + left_ele, in, isi, idx - 1);
            root.right = construct(pre, psi + left_ele + 1, pei, in, idx + 1, iei);

            return root;
      }

      public TreeNode buildTree(int[] preorder, int[] inorder) {
            return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
      }

}