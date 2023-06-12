import java.util.ArrayList;

//brute force approach 
public class fourSum {
    public static void main(String[] args) {
        int arr[] = { -1, -1, 0, 2, 0, -2 };
        ArrayList<ArrayList<Integer>> ans;
        ans = s4_1(arr, 0);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> s4_1(int arr[], int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int j2 = j + 1; j2 < n; j2++) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int k = j2 + 1; k < n; k++) {
                        long sum = arr[i] + arr[j];
                        sum += arr[j2];
                        sum += arr[k];
                        if ((int) sum == target) {
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[j2]);
                            temp.add(arr[k]);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
