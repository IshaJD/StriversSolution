public class sortProblem2 {
    public static void main(String[] args) {
        String arr[] = { "kiwi", "papapya", "mango", "apple", "avocado" };
        SortNames(arr);
    }

    // soprt strings in lexographical order using selection sort
    public static void SortNames(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            // when comparing two strings if they are equal it returns negative number else
            // positive number
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[k]) < 0)
                    k = j;
            }
            swap(arr, i, k);

        }
        System.out.println(" SORTED ARRAY OF FRUITS ");
        for (String val : arr) {
            System.out.println(val + " ");
        }
    }

    public static void swap(String arr[], int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
