public class CountSort {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 5, 3, 1, 3, 5 };
        Countsort(arr);

    }

    public static void Countsort(int arr[]) {
        int max = findMax(arr);
        int count[] = new int[max + 1];
        int n = arr.length;
        for (int i = 0; i < max + 1; i++) {
            count[i] = 0;

        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int i = 0, j = 0;
        while (i < max + 1) {
            if (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            } else
                i++;
        }
        System.out.println(" sorted array : ");
        for (int j2 = 0; j2 < n; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }

    public static int findMax(int arr[]) {
        int n = arr.length;
        int m = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }
}
