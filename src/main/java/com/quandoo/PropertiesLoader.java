package com.quandoo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * Class that extracts properties from the prop file.
 *
 * @author Sebastiano Armeli-Battana
 */
public class PropertiesLoader {
    private static final String PROP_FILE = "/test.properties";

    private PropertiesLoader() {
    }

    public static String loadProperty(String name) {
//        String resource = Thread.currentThread().getContextClassLoader().getResource(PROP_FILE).getFile();
        Properties props = new Properties();
//        InputStream inputStream;
        try {
//            inputStream = PropertiesLoader.class.getClassLoader().getResourceAsStream(resource);
            props.load(PropertiesLoader.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = "";

        if (name != null) {
            value = props.getProperty(name);
        }
        return value;
    }
}
