package org.iune.melbourne;

import org.iune.melbourne.contest.Contest;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    public static void main (String[] args) throws java.io.IOException {
        if (args.length != 1) {
            System.err.println("Usage: java TestDetectorFile FILENAME");
            System.exit(1);
        }

       new Contest("Name", new File(args[0]));
    }
}
