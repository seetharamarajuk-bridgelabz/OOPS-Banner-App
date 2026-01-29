package org.example;

/**
 * OOPSBannerApp UC2 - Render OOPS as Banner (spaces and *)
 * <p>
 * This Class demostrates the creation of ASSCII art banner using Object-Oriented Programming Principles
 * It extends the basic banner concept by displaying the word "OOPS" in a visual format using asterisks(*)
 * and spaces to form each letter
 * <p>
 * <p>
 * This Class demostrates a simple Java application that displays the object
 * Oriented Programming System OOPS acronym to the console.
 *
 * @author seetharamaraju
 * @version 2.0
 */

/**
 *  Extend the User Story 1 to display the message "OOPS" in a banner format
 *  Using characters formed by spaces and asterisks(*) to create a visual
 *  effect for each letter in the message.
 */

public class App {
    public static void main(String[] args) {
        System.out.println(
                " ******** " + "  ******** " + " ******** " + "  ********"
        );

        System.out.println(
                "*        *" + " *        *" + " *       *" + " *        "
        );

        System.out.println(
                "*        *" + " *        *" + " *       *" + " *        "
        );

        System.out.println(
                "*        *" + " *        *" + " ******** " + "  ********"
        );

        System.out.println(
                "*        *" + " *        *" + " *        " + "         *"
        );

        System.out.println(
                "*        *" + " *        *" + " *        " + "         *"
        );

        System.out.println(
                " ******** " + "  ******** " + " *        " + "  ********"
        );

    }
}
