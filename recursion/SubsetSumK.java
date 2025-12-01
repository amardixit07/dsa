import java.util.*;

public class SubsetSumK {

    static void findSubsets(int[] arr, int index, List<Integer> current, int sum, int target) {

        if (index == arr.length) {
            if (sum == target) {
                System.out.println(current);
            }
            return;
        }

        // Include current element
        current.add(arr[index]);
        findSubsets(arr, index + 1, current, sum + arr[index], target);

        // Exclude current element
        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, current, sum, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8};
        int target = 10;
        findSubsets(arr, 0, new ArrayList<>(), 0, target);
    }
}
