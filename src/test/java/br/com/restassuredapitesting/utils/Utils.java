package br.com.restassuredapitesting.utils;

public class Utils {

    public static String getSchemaBasePath(String pack, String nameSchema){
        return System.getProperty("user.dir")
                + "/src/test/java/br/com/restassuredapitesting/testes/"
                + pack
                + "/schema/"
                + nameSchema
                + ".json";
    }
    public static String getJsonPostPath(String name){
        return System.getProperty("user.dir")
                + "/src/test/java/br/com/restassuredapitesting/utils/"
                + name
                + ".json";
    }


}
