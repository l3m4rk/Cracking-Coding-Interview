package hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author l3m4rk
 * Created on 2019-02-02.
 */
public class StringTokens {

    private static List<String> splitIntoTokens(String input) {
        String[] array = input.split("[ !,?._'@]+");
        List<String> result = new ArrayList<>();
        for (String s : array) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> tokens = splitIntoTokens(input);
        System.out.println(tokens.size());
        tokens.forEach(System.out::println);

        scanner.close();
    }
}
