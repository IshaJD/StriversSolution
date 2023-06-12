import java.util.ArrayList;

public class leader1 {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> ans = Lead(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> Lead(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(max);
        for (int i = (n - 2); i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
