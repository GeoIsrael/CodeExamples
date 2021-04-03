package io;

public class Model {

    public String getMyPatch(){
        return this.getClass().getClassLoader().getResource("").getPath();

    }



}
