import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input email
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        // Loop through each character
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Check if character is a number or special
            if (!Character.isLetter(ch)) {
                int count = 0;

                // Count how many times it appears
                for (int j = 0; j < email.length(); j++) {
                    if (email.charAt(j) == ch) {
                        count++;
                    }
                }

                // Display results
                if (email.indexOf(ch) == i) {
                    System.out.println(ch + " ---> " + count);
                }
            }
        }
    }
}
