package io;

import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("1: " + s );

        System.out.println("2: " + Paths.get(".").toAbsolutePath().normalize().toString() );

        Path path = FileSystems.getDefault().getPath("");
        System.out.println("3: " +path.toAbsolutePath().toString());

        Path cwd = Path.of("").toAbsolutePath();
        System.out.println("4: " + cwd);

        //Get Classes path
        URL location = PathExample.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());

        Model model = new Model();
        System.out.println(model.getMyPatch());


    }



}
