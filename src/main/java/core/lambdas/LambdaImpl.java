package core.lambdas;

import lombok.SneakyThrows;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class LambdaImpl {

    public static void main(String[] args) {


        List<URL> urlList = Arrays.asList("http://localhost/", "https://github.com")
                .stream()
                .map(u -> {
                    try {
                        return new URL(u);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toList());

        System.out.println(urlList);


    }

}

