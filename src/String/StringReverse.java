package String;

public class StringReverse {
    public static void main(String[] args) {
        String original = "Java";
        String reversed = "";

        // Using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

