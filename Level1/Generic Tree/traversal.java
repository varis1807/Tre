import java.util.*;

public class traversal {
      public static List<Integer> ans = new List<>();

      public static List<Integer> preOreder(Node root) {
            if (root == null)
                  return list;
            ans.add(root.data);
            for (Node child : root.children)
                  preOreder(child);

            return ans;
      }
}
