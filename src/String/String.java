public class String  {
    public static void main(java.lang.String[] args) {
        // Creating Strings
        java.lang.String str1 = "Hello";  // String literal (stored in String Pool)
        java.lang.String str2 = new java.lang.String("World"); // Using 'new' keyword (Heap memory)

        // Concatenation
        java.lang.String result = str1 + " " + str2; // Using '+'
        System.out.println("Concatenated: " + result);

        // String Length
        System.out.println("Length: " + result.length());

        // Character at specific index
        System.out.println("Char at index 1: " + result.charAt(1));

        // Substring
        System.out.println("Substring: " + result.substring(0, 5));

        // String Comparison
        java.lang.String str3 = "hello";
        System.out.println("Equals (case-sensitive): " + str1.equals(str3)); // false
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3)); // true

        // String Contains
        System.out.println("Contains 'World': " + result.contains("World"));

        // Convert to Uppercase and Lowercase
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // Trim (Removes leading and trailing spaces)
        java.lang.String spacedStr = "   Java Programming   ";
        System.out.println("Trimmed: '" + spacedStr.trim() + "'");

        // Replace characters
        System.out.println("Replace 'World' with 'Java': " + result.replace("World", "Java"));

        // Split string
        java.lang.String csv = "apple,banana,grape";
        java.lang.String[] fruits = csv.split(",");
        System.out.println("Split Result:");
        for (java.lang.String fruit : fruits) {
            System.out.println(fruit);
        }

        // Convert String to Char Array
        char[] charArray = result.toCharArray();
        System.out.println("Char Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // String to Integer and Integer to String
        java.lang.String numStr = "100";
        int num = Integer.parseInt(numStr);
        System.out.println("Converted to int: " + (num + 50));

        int number = 200;
        java.lang.String numString = java.lang.String.valueOf(number);
        System.out.println("Converted to String: " + numString);
    }
}
