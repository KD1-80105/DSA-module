import java.util.Arrays;
import java.util.Stack;

public class RevStack {
    public static void reverseStack(int arr[]) {
        Stack<Integer> integers = new Stack<>();

        for (int iterable_element : arr) {
            integers.push(iterable_element); 
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Before Reversing: " + Arrays.toString(arr));

        reverseStack(arr);
        System.out.println("After Reversing: " + Arrays.toString(arr));
    }
}
