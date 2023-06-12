import java.util.HashMap;
import java.util.Map.Entry;

public class major2 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("ans= " + major1(arr, 7));
    }

    public static int major1(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], value + 1);

        }
        for (Entry<Integer, Integer> it : hm.entrySet()) {
            if (it.getValue() > (n / 2))
                return it.getKey();
        }
        return -1;
    }
}
