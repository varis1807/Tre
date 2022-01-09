import java.util.*;

public class tiltBinaryTree {
      public static class tiltPair {
            int tiltSF = 0;
            int sum = 0;
      }

      public static tiltPair findTilt(Node root) {
            if (root == null)
                  return new tiltPair();
            tiltPair left = findTilt(root.left);
            tiltPair right = findTilt(root.right);
            tiltPair myAns = new tiltPair();
            myAns.tiltSF = left.tiltSF + right.tiltSF + Math.abs(left.sum - right.sum);

            myAns.sum = left.sum + right.sum + root.data;
            return myAns;
      }

      public static int findTiltSF(Node root) {
            tiltPair ret = findTilt(root);
            return ret.tiltSF;
      }
}
