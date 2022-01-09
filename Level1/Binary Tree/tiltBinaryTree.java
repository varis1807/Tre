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

      // With pair
      // {tiltSF,sum}
      public int[] findTilt2(Node root) {
            if (root == null)
                  return new int[2];

            int[] left = findTilt2(root.left);
            int[] right = findTilt2(root.right);

            int[] myAns = new int[2];
            myAns[0] = left[0] + right[0] + Math.abs(left[1] - right[1]);
            myAns[1] = left[1] + right[1] + root.data;
            return myAns;
      }
}
