public class rotatem {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotated[][] = rotate(arr, 3);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int matrix[][], int n) {
        Transpose(matrix);
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
        return matrix;
    }

    public static int[] reverse(int arr[]) {

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void Transpose(int m[][]) {
        int n = m.length;
        int c[][] = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                c[i][j] = m[j][i];
            }
        }
        // copying elements
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = c[i][j];
            }
        }
    }
}
