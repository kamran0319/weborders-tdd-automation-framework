package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("us"));
        System.out.println(properties.getProperty("url"));


    }
}
