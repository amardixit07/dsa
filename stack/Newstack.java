import java.util.Stack;
public class Newstack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Does stack contain 2? " + stack.contains(2));
        System.out.println("Stack elements: " + stack);
    }
}