import java.util.*;

public class burnTreeWithWtr {
      // burning tree with water nodes
      // ========================================================

      public static int find_burningTre(Node root, Node data, ArrayList<ArrayList<Integer>> ans, HashSet<Node> water) {
            if (root == null)
                  return -1;

            if (root == data) {
                  // get every node below this node
                  getBurningNodesAtSpecificTime(root, 0, ans, null, water);
                  return 1;
            }

            int left_dis = find_burningTre(root.left, data, ans, water);
            int right_dis = find_burningTre(root.right, data, ans, water);

            if (left_dis >= 0) {
                  // get nodes
                  getBurningNodesAtSpecificTime(root, left_dis, ans, root.left, water);
                  return left_dis + 1;
            }

            if (right_dis >= 0) {
                  // get nodes
                  getBurningNodesAtSpecificTime(root, right_dis, ans, root.right, water);
                  return right_dis + 1;
            }

            return -1;
      }

      public static void burningTree_water(Node root, Node data, ArrayList<Node> waterNodes) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            HashSet<Node> water = new HashSet<>();

            for (Node w : waterNodes) {
                  water.add(w);
            }

            find_burningTre(root, data, ans, water);

      }

      public static void getBurningNodesAtSpecificTime(Node root, int time, ArrayList<ArrayList<Integer>> ans,
                  Node blocker, HashSet<Node> water) {
            if (root == null || root == blocker || water.contains(root))
                  return;

            if (time == ans.size()) {
                  ans.add(new ArrayList<>());
            }

            ans.get(time).add(root.val);

            getBurningNodesAtSpecificTime(root.left, time + 1, ans, blocker, water);
            getBurningNodesAtSpecificTime(root.right, time + 1, ans, blocker, water);
      }

}
