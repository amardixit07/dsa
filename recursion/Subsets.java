import java.util.*;

public class Subsets {
    public static void generate(int[] arr, int idx, List<Integer> curr) {
        if (idx == arr.length) {
            System.out.println(curr);
            return;
        }
        curr.add(arr[idx]);
        generate(arr, idx + 1, curr);
        curr.remove(curr.size() - 1);
        generate(arr, idx + 1, curr);
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}
