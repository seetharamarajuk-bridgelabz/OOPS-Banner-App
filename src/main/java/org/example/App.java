package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Render OOPS using Map and Function
 * <p>
 * Demonstrates centralized character pattern management
 * using HashMap and dynamic banner rendering.
 *
 * @author seetharamaraju
 * @version 8
 */

public class App {
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = loadCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    /**
     * Builds and returns a Map of character patterns
     *
     * @return Map<Character, String [ ]>
     */
    private static Map<Character, String[]> loadCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{"*********", "*       *", "*       *", "*       *", "*       *", "*       *", "*********"});

        map.put('P', new String[]{"*********", "*       *", "*       *", "*********", "*        ", "*        ", "*        "});

        map.put('S', new String[]{"*********", "*        ", "*        ", "*********", "        *", "        *", "*********"});

        return map;
    }

    /**
     * Renders the banner for a given word
     *
     * @param word       text to render
     * @param patternMap character pattern repository
     */
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}
