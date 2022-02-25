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
public class BTFromIN_POSTorderTraversal {
  // leet 106 ============================================== 

  public TreeNode construct2(int[] post, int psi, int pei, int[] in, int isi, int iei){
      if(psi>pei) return null;

      TreeNode root=new TreeNode(post[pei]);


      int idx=isi;
      int find_ele=post[pei];

      while(in[idx]!=find_ele){
          idx++;
      }        

      int left_ele=idx-isi;

      root.left=construct2(post,psi,psi+left_ele-1,in,isi,idx-1);
      root.right=construct2(post,psi+left_ele,pei-1,in,idx+1,iei);

      return root;
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {
      return construct2(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
  }    
}
