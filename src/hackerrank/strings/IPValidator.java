package hackerrank.strings;

import java.util.Scanner;

/**
 * @author l3m4rk
 * Created on 2019-02-02.
 */
public class IPValidator {

    private static boolean check(String ip) {
        return ip.matches("\\b(25[0-5]|24[0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            final String possibleIPAddress = scanner.nextLine();
            System.out.println(check(possibleIPAddress));
        }
        scanner.close();
    }
}
