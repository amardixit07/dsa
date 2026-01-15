import java.util.*;

public class PowerSet {

    // Recursive function
    static void generateSubsets(int[] arr, int index, List<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // 1️⃣ Include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // Backtracking step
        current.remove(current.size() - 1);

        // 2️⃣ Exclude current element
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}
