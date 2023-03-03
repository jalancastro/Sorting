package org.example.aggregation;

public class Driver {

    public static void main(String[] args) {
        Folder folder = new Folder();
        File file1 = new File();
        File file2 = new File();
        File[] files = {file1, file2};
        Folder folder2 = new Folder(files);
    }
}
