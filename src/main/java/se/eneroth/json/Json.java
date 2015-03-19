package se.eneroth.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Json {

	public static void main(String[] args) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> userData = mapper.readValue(new File("input.json"), Map.class);
//        System.out.println(userData);
//        String url = (String)userData.get(new String("url"));
//        System.out.println("url=" + url);
//        int len = (Integer)userData.get(new String("length"));
//        System.out.println("length=" + len);
//        boolean isMovie = (Boolean)userData.get(new String("isMovie"));
//        System.out.println("isMovie=" + isMovie);
//
//        ObjectMapper mapper2 = new ObjectMapper();
//        Model userData2 = mapper.readValue(new File("input2.json"), Model.class);
//        System.out.println("userData2.getId()=" + userData2.getId());
//        System.out.println("userData2.getAttributes().get(\"name\")=" + userData2.getAttributes().get("name"));
//        System.out.println("userData2.getAttributes().get(\"url\")=" + userData2.getAttributes().get("url"));



        ObjectMapper mapper = new ObjectMapper();
        EntryResponse response = mapper.readValue(new File("appgrid_testdata_page.json"), EntryResponse.class);
        System.out.println("response.getEntries()[0].getTitle()=" + response.getEntries()[0].getTitle());
        System.out.println("response.getEntries()[0].get_meta().getId()=" + response.getEntries()[0].get_meta().getId());
        System.out.println("response.getEntries()[0].get_meta().getType()=" + response.getEntries()[0].get_meta().getType());
        System.out.println("response.getEntries()[0].get_meta().getTypeId()=" + response.getEntries()[0].get_meta().getTypeId());
        System.out.println("response.getEntries()[0].getContainers()=" + response.getEntries()[0].getContainers());


        EntryResponse response2 = mapper.readValue(new File("appgrid_testdata_container.json"), EntryResponse.class);
        System.out.println("response.getEntries()[0].getTitle()=" + response2.getEntries()[0].getTitle());
        System.out.println("response.getEntries()[0].get_meta().getId()=" + response2.getEntries()[0].get_meta().getId());
        System.out.println("response.getEntries()[0].get_meta().getType()=" + response2.getEntries()[0].get_meta().getType());
        System.out.println("response.getEntries()[0].get_meta().getTypeId()=" + response2.getEntries()[0].get_meta().getTypeId());
        System.out.println("response.getEntries()[0].getItems()=" + response2.getEntries()[0].getItems());

        EntryResponse response3 = mapper.readValue(new File("appgrid_testdata_item.json"), EntryResponse.class);
        System.out.println("response.getEntries()[0].getTitle()=" + response3.getEntries()[0].getTitle());
        System.out.println("response.getEntries()[0].get_meta().getId()=" + response3.getEntries()[0].get_meta().getId());
        System.out.println("response.getEntries()[0].get_meta().getType()=" + response3.getEntries()[0].get_meta().getType());
        System.out.println("response.getEntries()[0].get_meta().getTypeId()=" + response3.getEntries()[0].get_meta().getTypeId());
        System.out.println("response.getEntries()[0].getAttributes()=" + response3.getEntries()[0].getAttributes());
    }
}