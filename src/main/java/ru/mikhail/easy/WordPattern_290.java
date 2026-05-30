package ru.mikhail.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    private static boolean wordPattern(String pattern, String s) {

        Map<Character, String> match = new HashMap<>();

        char[] patternLetters = pattern.toCharArray();
        int i = 0;

        String[] words = s.split(" ");

        if(words.length != patternLetters.length) return false;

        for (String word : words) {
            char pl = patternLetters[i];
            if (match.containsKey(pl)) {
                if (!match.get(pl).equals(word)) return false;
            } else if (match.containsValue(word)) {
                return false;
            } else match.put(pl, word);
            i++;
        }
        return true;
    }
}
