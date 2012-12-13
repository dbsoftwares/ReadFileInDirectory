/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.readfilefromdir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Deniel Buzas
 */
public class AlternateRead {

    public void read(String absolutePath) {
        final File fFile = new File(absolutePath);

        try {
            try (Scanner inFile = new Scanner(fFile)) {
                while (inFile.hasNextLine()) {
                    // a name (nev) valtozoba menti a file-bol a nevet
                    String name = inFile.nextLine();
                    // a city (varos) valtozoba menti a file-bol a varost
                    String city = inFile.nextLine();
                    // a point1 (pont1) valtozoba menti az elso pontot
                    String point1 = inFile.nextLine();
                    // a point2 (pont2) valtozoba menti a masodik pontot
                    String point2 = inFile.nextLine();
                    // a point3 (pont3) valtozoba menti a harmadik pontot
                    String point3 = inFile.nextLine();
                    // a point4 (pont4) valtozoba menti a negyedik pontot
                    String point4 = inFile.nextLine();
                    // a point5 (pont5) valtozoba menti az otodik pontot
                    String point5 = inFile.nextLine();
                    // test
                    System.out.println(name);
                    System.out.println(city);
                    System.out.println(point1);
                    System.out.println(point2);
                    System.out.println(point3);
                    System.out.println(point4);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.err);
                    
        }
    }
}
