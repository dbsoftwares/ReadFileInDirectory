package org.dbsoftwares.readfilefromdir;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György (ptoth @ github.com)
 * @author Deniel Buzas (dbuzas @ github.com) 
 * @since 2012.12.13.
 */

public class ReadFileFromDir {

    public static void main(String[] args) {
        System.out.println("Hi Den!");
        //init scanner for input data:
        Scanner input = new Scanner(System.in);
        
        /**
         * Get the full path and the filename
         * example:
         * /Users/Den/
         * log.txt
         */
//        System.out.println("I need a directory absolute path first:");
        System.out.println("Give me the file's name then:");
        String dirPath = input.nextLine();
        File specifiedDirectory = new File(dirPath);
//        

        if (!specifiedDirectory.exists() || !specifiedDirectory.canRead()) {
            System.err.println("There is no such dir or access to it!");
        } else{
            System.out.println("Directory access granted!");
            //System.out.println(dirPath.getAbsolutePath());
            //File specifiedFile = new File(fileName);
            
            //System.out.println(specifiedFile.getParent());
        }
    }
}
