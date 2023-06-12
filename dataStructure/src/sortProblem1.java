public class sortProblem1 {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 3, 0, 0, 4 };
        System.out.println(" sorted array ");
        MoveZero(arr);

    }

    // sort 00 at end od array maintaining same order of nonzero elements using
    // bubble sort
    public static void MoveZero(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    swap(arr, j, j + 1);
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
