package org.example;

/**
 * OOPSBannerApp UC6 - Refactor Banner Logic into Functions
 * <p>
 * This use case improves upon UC5 by extracting banner pattern logic
 * into reusable helper methods. This follows DRY, abstraction,
 * and modular design principles.
 *
 * @author seetharamaraju
 * @version 6
 */
public class App {
    public static void main(String[] args) {

        // Get patterns for each character
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Combine O O P S line by line
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    private static String[] getOPattern() {
        return new String[]{
                "*********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*********"
        };
    }

    // Helper method for letter P
    private static String[] getPPattern() {
        return new String[]{
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        };
    }

    // Helper method for letter S
    private static String[] getSPattern() {
        return new String[]{
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };
    }
}
