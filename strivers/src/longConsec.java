import java.util.Arrays;

public class longConsec {
    public static void main(String[] args) {
        int arr[] = { 100, 200, 1, 2, 3, 4 };
        System.out.println("longest consecutive length= " + longConsecutive(arr));
    }

    public static int longConsecutive(int arr[]) {
        int n = arr.length;
        int prev = arr[0];
        int curr = 1;
        int ans = 1;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            // comapre if next element is consecutive or not if yes increase one
            if (arr[i] == prev + 1) {
                curr++;
            }
            // else drcrease one
            else if (arr[i] != prev)
                curr = 1;
            prev = arr[i];
            ans = Math.max(ans, curr);

        }
        return ans;
    }
}