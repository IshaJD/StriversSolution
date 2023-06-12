import java.util.ArrayList;

public class moreN {
    public static void main(String[] args) {
        int arr[] = { 11, 33, 33, 11, 33, 11 };
        ArrayList<Integer> ans = MoreThan(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> MoreThan(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // selected element is v[i]:
            // Checking if v[i] is not already
            // a part of the answer:
            if (ls.size() == 0 || ls.get(0) != arr[i]) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    // counting the frequency of v[i]
                    if (arr[j] == arr[i]) {
                        cnt++;
                    }
                }

                // check if frquency is greater than n/3:
                if (cnt > (n / 3))
                    ls.add(arr[i]);
            }

            if (ls.size() == 2)
                break;
        }
        return ls;
    }
}
