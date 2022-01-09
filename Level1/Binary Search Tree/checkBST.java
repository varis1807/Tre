import java.util.*;

class Node {
      Node left, right;
      int data;

      Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
      }

      Node(int data) {
            this(data, null, null);
      }
}