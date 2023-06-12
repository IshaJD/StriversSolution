import java.util.HashMap;

public class xorK {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        System.out.println("total subarrays are = " + SubarrayXor1(arr, 6));
        System.out.println("total subarrays are = " + SubarrayXor2(arr, 6));
        System.out.println("total subarrays are = " + SubarrayXor3(arr, 6));
    }

    // brute force approach using three loops
    public static int SubarrayXor1(int arr[], int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;

                for (int j2 = i; j2 <= j; j2++) {
                    xor = xor ^ arr[j2];
                }

                if (xor == k) {
                    count++;
                }

            }
        }
        return count;
    }

    // better approach using two loops
    public static int SubarrayXor2(int arr[], int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
                xor = xor ^ arr[j];
                if (xor == k) {
                    count++;
                }

            }
        }
        return count;
    }

    // optimla approach using x=xr^k
    public static int SubarrayXor3(int arr[], int k) {
        int n = arr.length;
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(xor, 1);
        for (int i = 0; i < n; i++) {
            // prefix xor till index i
            xor = xor ^ arr[i];
            // by formula x=xor^k;
            int x = xor ^ k;
            if (hm.containsKey(x)) {
                // if map contains the key then add its value to count
                count += hm.get(x);
            }
            if (hm.containsKey(xor)) {
                hm.put(xor, hm.get(xor) + 1);
            } else {
                hm.put(xor, 1);
            }

        }
        return count;
    }
}
