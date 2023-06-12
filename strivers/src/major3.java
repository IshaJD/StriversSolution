public class major3 {
    public static void main(String[] args) {
        // moore voting algo
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("ans= " + major2(arr, 7));
    }

    public static int major2(int arr[], int n) {
        int el = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i])
                cnt++;
            else
                cnt--;
        }
        // check if stored element is majority or no
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el)
                cnt1++;
        }
        if (cnt1 > (n / 2))
            return el;
        return -1;
    }
}
