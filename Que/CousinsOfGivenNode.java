import java.util.*;

public class CousinsOfGivenNode {
      static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                  this.data = data;
                  left = null;
                  right = null;
            }
      }

      public static ArrayList<Integer> printCousins(Node root, Node node_to_find)
      {
          //code here
          if(root==null)
          return new ArrayList<Integer>{-1};
          
          
      }
}