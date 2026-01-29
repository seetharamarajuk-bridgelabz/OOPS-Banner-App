package org.example;

/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author seetharamaraju
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.
public class App {
    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = String.join("",
                "********* ", "********* ", "********* ", "*********");

        banner[1] = String.join("",
                "*       * ", "*       * ", "*       * ", "*        ");

        banner[2] = String.join("",
                "*       * ", "*       * ", "*       * ", "*        ");

        banner[3] = String.join("",
                "*       * ", "*       * ", "********* ", "*********");

        banner[4] = String.join("",
                "*       * ", "*       * ", "*         ", "        *");

        banner[5] = String.join("",
                "*       * ", "*       * ", "*         ", "        *");

        banner[6] = String.join("",
                "********* ", "********* ", "*         ", "*********");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
