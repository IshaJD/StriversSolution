public class longestSubarray {
    public static void main(String[] args) {

    }

    public static void SubArray(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum = arr[j] + arr[k];
                }
            }
        }
    }
}
