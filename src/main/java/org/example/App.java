package org.example;

/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * <p>
 * This use case improves upon UC4 by combining array declaration and
 * initialization using inline String.join() calls. This reduces verbosity
 * while maintaining modularity and readability.
 *
 * @author seetharamaraju
 * @version 5
 */
public class App {
    public static void main(String[] args) {

        // Inline array declaration + initialization using String.join()
        String[] bannerLines = {
                String.join("",
                        "*********  ", "*********  ", "*********  ", "*********"),
                String.join("",
                        "*       *  ", "*       *  ", "*       *  ", "*        "),
                String.join("",
                        "*       *  ", "*       *  ", "*       *  ", "*        "),
                String.join("",
                        "*       *  ", "*       *  ", "*********  ", "*********"),
                String.join("",
                        "*       *  ", "*       *  ", "*          ", "        *"),
                String.join("",
                        "*       *  ", "*       *  ", "*          ", "        *"),
                String.join("",
                        "*********  ", "*********  ", "*          ", "*********")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }

    }
}
