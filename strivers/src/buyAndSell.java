// import java.util.*;
public class buyAndSell {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("maximum profit= " + BuyndSell(arr));
    }

    public static int BuyndSell(int arr[]) {
        int n = arr.length;
        int maxpro = 0;
        // arr[i]=buying and arr[j]==selling
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    maxpro = Math.max(arr[j] - arr[i], maxpro);
                }
            }
        }
        return maxpro;
    }
}
