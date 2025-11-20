public class ReverseStringRec {

    static String reverse(String s) {
        // base case
        if (s.length() == 0) {
            return "";
        }

        // recursive call: substring removes first character
        // stack builds like:
        // reverse("amit")
        // reverse("mit")
        // reverse("it")
        // reverse("t")
        // reverse("")
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "amit";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}
