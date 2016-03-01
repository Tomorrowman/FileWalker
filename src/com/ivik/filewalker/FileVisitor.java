package com.ivik.filewalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Eigenaar on 1-3-2016.
 */
public class FileVisitor {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get();


        Files.walkFileTree(path, new VisitMyFiles());
    }
}
