package org.example;

/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 * <p>
 * This use case improves upon UC6 by encapsulating
 * character patterns inside a dedicated inner static class.
 *
 * @author seetharamaraju
 * @version 7
 */

public class App {
    public static void main(String[] args) {

        // Create character pattern objects
        CharacterPattern o = new CharacterPattern('O', new String[]{
                "*********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*********"
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        });

        // Store characters in array (O O P S)
        CharacterPattern[] word = {o, o, p, s};

        // Build banner line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append("  ");
            }
            System.out.println(line);
        }
    }

    /**
     * Inner Static Class to encapsulate
     * character and its banner pattern
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character pattern
         *
         * @param character banner character
         * @param pattern   7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return banner pattern lines
         */
        public String[] getPattern() {
            return pattern;
        }
    }

}
