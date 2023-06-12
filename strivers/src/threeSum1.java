import java.util.ArrayList;
import java.util.Arrays;

public class threeSum1 {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        ArrayList<ArrayList<Integer>> ans;
        ans = three1(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> three1(int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int j = i + 1;
                int k = n - 1, sum = 0 - arr[i];
                ArrayList<Integer> temp = new ArrayList<>();

                while (j < k) {
                    if (arr[j] + arr[k] == sum) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        ans.add(temp);
                        // do i++ if adjacent elements are same
                        while (j < k && arr[j] == arr[j + 1])
                            j++;

                        while (j < k && arr[k] == arr[k - 1])
                            k--;
                        // else only move one step
                        j++;
                        k--;
                    } else if (arr[j] + arr[k] < sum)
                        j++;
                    else
                        k--;

                }
            }
        }
        return ans;
    }
}
