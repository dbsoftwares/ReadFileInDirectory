package org.dbsoftwares.readfilefromdir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György (github.com/ptoth)
 * @author Deniel Buzas (github.com/dbuzas)
 * @since 2012.12.13.
 */
public class ReadFileFromDir {

    public static void main(String[] args) {
        System.out.println("Hi Den!");
        //init scanner for input data:
        Scanner input = new Scanner(System.in);

        /**
         * Get the full path example: C:\Users\Den\log.txt
         */
        System.out.println("Give me the file's abs. path:");
        String dirPath = input.nextLine();
        File fileToRead = new File(dirPath);

        
    }
}
