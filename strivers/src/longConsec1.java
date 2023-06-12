import java.util.HashSet;

public class longConsec1 {
    public static void main(String[] args) {
        int arr[] = { 100, 200, 2, 3, 4, 5 };
        System.out.println("longest length= " + LongC(arr));
    }

    public static int LongC(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            set.add(num);
        }
        int longestStreak = 1;
        for (int num : arr) {
            // check if set contains num-1
            if (set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
