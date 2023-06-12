
public class countSum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 3 };
        int count = 0;
        int n = arr.length;
        // FIND THE TRIPLETS WHOSE SUM IS EQUAL TO TARGET
        // HERE TARGET IS 12
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int j2 = j; j2 < n; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == 12) {
                        count++;

                    }
                }
            }
        }
        System.out.println("the total triplets  are =" + count);
    }
}
