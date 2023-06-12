import java.util.ArrayList;
import java.util.*;

public class rearrange1 {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = rearrange2(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> rearrange2(ArrayList<Integer> a) {
        int posindex = 0, negindex = 1;
        int n = a.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 0) {
                ans.set(negindex, a.get(i));
                negindex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posindex, a.get(i));
                posindex += 2;
            }
        }
        return ans;

    }

}
