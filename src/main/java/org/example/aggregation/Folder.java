package org.example.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    List<File> files = new ArrayList<>();

    public Folder() {

        for (int i = 1; i <= 10; i++) {
            files.add(new File());
        }
        System.out.println("Number of files: " + files.size());
    }

    public Folder(File[] f) {

        for (int i = 1; i <= f.length; i++) {

            //aggregation
            files.add(f[i]);
        }
        System.out.println("Number of files: " + files.size());

    }

}
