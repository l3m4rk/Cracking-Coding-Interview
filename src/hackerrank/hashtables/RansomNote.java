package hackerrank.hashtables;

import java.util.HashMap;
import java.util.Map;

/**
 * @author l3m4rk
 * Created on 2019-01-20.
 */
public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineFreq = getTextFrequency(magazine);
        Map<String, Integer> noteTable = getTextFrequency(note);

        boolean possible = hasEnoughWords(magazineFreq, noteTable);

        System.out.println(possible ? "Yes" : "No");
    }

    private static boolean hasEnoughWords(Map<String, Integer> magazineFreq, Map<String, Integer> noteTable) {
        for (Map.Entry<String, Integer> entry : noteTable.entrySet()) {
            String word = entry.getKey();
            if (!magazineFreq.containsKey(word) || magazineFreq.get(word) < noteTable.get(word)) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, Integer> getTextFrequency(String[] text) {
        Map<String, Integer> frequencies = new HashMap<>();
        for (String w : text) {
            if (frequencies.containsKey(w)) {
                frequencies.put(w, frequencies.get(w) + 1);
            }
            frequencies.put(w, 1);
        }
        return frequencies;
    }

    public static void main(String[] args) {
        checkMagazine("ive got a lovely bunch of coconuts".split(" "),
                "ive got some coconuts".split(" "));

        checkMagazine("two times three is not four".split(" "),
                "two times two is four".split(" "));
    }
}
