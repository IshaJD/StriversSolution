import java.util.ArrayList;

public class rearrange {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, -5 };
        Rearrange(arr);

    }

    public static void Rearrange(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        for (int i = 0; i < n / 2; i++) {

            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }

    }

    public static void Prints(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
