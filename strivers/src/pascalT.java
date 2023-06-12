
public class pascalT {
    public static void main(String[] args) {
        // int r = 5;
        // int c = 3;
        // System.out.println("element= " + pascalTriangle(r, c));
        // pascal1(5);
        pascal2(5);
        // completeP(6);

    }

    // problem 1--> to find element
    public static long nCr(int n, int r) {
        /*
         * n is the row and r is the col and this fun
         * return the number at particular place with given row and col
         */
        long ans = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i);
            ans = ans / (i + 1);
        }
        return ans;
    }

    // this code is to find the element
    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void pascal1(int n) {
        for (int c = 0; c < n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void pascal2(int n) {
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void completeP(int n) {
        for (int i = 0; i < n; i++) {
            pascal1(i);
        }
        // System.out.println();
    }

}