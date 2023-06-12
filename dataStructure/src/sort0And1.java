import java.util.Scanner;

public class sort0And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array : ");
        printArray(arr);
        System.out.println("sorted array : ");

        SortArray(arr);
        sc.close();
    }

    static int[] printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static void SortArray(int arr[]) {
        int n = arr.length;
        int count = 0;
        int ans[] = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        for (int i = 0; i < ans.length; i++) {
            if (i < count)
                ans[k++] = 0;
            else
                ans[k++] = 1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
