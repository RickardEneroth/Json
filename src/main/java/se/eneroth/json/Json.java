package se.eneroth.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Json {

	public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> userData = mapper.readValue(new File("input.json"), Map.class);
        System.out.println(userData);
        String url = (String)userData.get(new String("url"));
        System.out.println("url=" + url);
        int len = (Integer)userData.get(new String("length"));
        System.out.println("length=" + len);
        boolean isMovie = (Boolean)userData.get(new String("isMovie"));
        System.out.println("isMovie=" + isMovie);
    }
}