import java.util.Arrays;

public class elementAtindex {
    

    public static int[] findoccurence(int arr[], int index, int count,int element) {
        if (index == arr.length) {
            System.out.println("base case"+count);
            return new int[count]; 
        }
        if (arr[index]==element) {
            count++; }
            int[] result = findoccurence(arr, index + 1, count, element);
            if (arr[index]==element) {
                result[count - 1] = index; 
            }
            System.out.println("index : "+index+" , count : "+count+" , result :"+Arrays.toString(result));
            return result;
    

        
 
    
}
public static void main(String[] args) {
    int[] arr ={10,20,20,40,50};
    System.out.println("the no is at indexes : "+Arrays.toString(findoccurence(arr, 0,0,20)));
}
}
