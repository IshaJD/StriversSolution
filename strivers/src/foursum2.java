import java.util.ArrayList;
import java.util.Arrays;

public class foursum2 {
    // optimal approach by fixing i,j and moving k and l
    public static void main(String[] args) {
        int arr[] = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        ArrayList<ArrayList<Integer>> ans;
        ans = s4_3(arr, 9);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> s4_3(int arr[], int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // avoid duplicates
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // avoid duplicates
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);

                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k + 1])
                            k++;
                        while (k < l && arr[l] == arr[l - 1])
                            l--;
                    } else if (sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return ans;
    }
}
