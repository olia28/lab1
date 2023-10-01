package Task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an email address:");
        String email = input.nextLine();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        input.close();
    }

    public static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = -1;
        int dotIndex = -1;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '@') {
                atIndex = i;
            } else if (ch == '.') {
                dotIndex = i;
            }
        }

        return atIndex > 0 && dotIndex > atIndex && dotIndex != email.length() - 1;
    }
}
