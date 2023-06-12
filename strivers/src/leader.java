import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class leader {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 22, 12, 3, 0, 6));
        ArrayList<Integer> ans = Leader(arr);
        Collections.sort(ans, Collections.reverseOrder());

        System.out.println(ans);
    }

    public static ArrayList<Integer> Leader(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) > arr.get(i))
                    flag = false;
                break;
            }

            if (flag) {
                ans.add(arr.get(i));
            }
        }
        return ans;
    }
}
