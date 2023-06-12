public class apattern {
    public static void main(String[] args) {
        // printA(5);
        // printT(5);
        // printD(9);
        printDat(11);
    }

    // ***********diagonal*********
    // public static void printA(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == j)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }
    // ********cross************
    // public static void printA(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == j || (i + j == 10) || i == 0 || j == 0 || i == 10 || j == 10)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }

    // ********print A********
    public static void printA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printT(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printD(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 1 || ((i == 0 || i == n - 1) && (j > 1 && j < n - 2)) || (j == n - 2 && i != 0 && i != n - 1))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // print eat
    public static void printDat(int n) {
        // d
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 1 || ((i == 0 || i == n - 1) && (j > 1 && j < n - 2)) || (j == n - 2 && i != 0 && i != n - 1))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // a
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // t
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
        }

    }
}
