package Task02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of words: ");
        int n = input.nextInt();
        input.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter word number " + (i + 1) + ": ");
            arr[i] = input.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int uppercaseCount1 = countUppercaseLetters(str1);
                int uppercaseCount2 = countUppercaseLetters(str2);

                return Integer.compare(uppercaseCount1, uppercaseCount2);
            }

            private int countUppercaseLetters(String str) {
                int count = 0;
                for (char c : str.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        count++;
                    }
                }
                return count;
            }
        });

        System.out.println("Sorted words:");
        for (String str : arr) {
            System.out.println(str);
        }

        input.close();
    }
}