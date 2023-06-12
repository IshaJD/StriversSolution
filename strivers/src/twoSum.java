public class twoSum {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 7 };
        int ans[] = twoSum(5, a, 9);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");
    }

    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] twoSum(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

}
