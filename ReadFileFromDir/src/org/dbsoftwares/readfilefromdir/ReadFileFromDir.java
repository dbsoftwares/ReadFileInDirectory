package org.dbsoftwares.readfilefromdir;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        try{
            // Open the file that is the first command line parameter
            FileInputStream fstream;
            fstream = new FileInputStream(dirPath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
            }
        } catch (FileNotFoundException ex) {
                Logger.getLogger(ReadFileFromDir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
                Logger.getLogger(ReadFileFromDir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
