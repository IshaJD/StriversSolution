import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// better approach for four sum using hashset
public class fourSum1 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        int target = 9;
        List<List<Integer>> ans = s4_2(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }

    public static List<List<Integer>> s4_2(int arr[], int target) {
        int n = arr.length;
        // to contains set of lists
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // to check the existence of values
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    long fourth = target - sum;
                    // to temporarily store the elements
                    // check if value is in hashset or not if yes then add it
                    if (hashset.contains(fourth)) {
                        List<Integer> list = new ArrayList<>();

                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add((int) fourth);
                        list.sort(Integer::compareTo);
                        set.add(list);
                    }
                    // if not present then add it to hashset
                    hashset.add((long) arr[k]);
                }

            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
