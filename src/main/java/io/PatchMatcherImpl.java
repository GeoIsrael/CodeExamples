package io;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

public class PatchMatcherImpl {


    public static void main(String[] args) {
//        Path p = Path.of("").toAbsolutePath();
        PathMatcher matcher = (Path p) -> {return p.toString().contains("1");};
        System.out.println(matcher.toString());
    }




}
