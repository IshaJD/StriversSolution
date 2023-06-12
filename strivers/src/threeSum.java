import java.util.ArrayList;;

public class threeSum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        ArrayList<ArrayList<Integer>> ans;
        ans = Three(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> Three(int arr[]) {
        int n = arr.length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int j2 = j + 1; j2 < n; j2++) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    if (arr[i] + arr[j] + arr[j2] == 0) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[j2]);
                    }
                    if (temp.size() != 0) {
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}
