package models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Album album1 = new Album(1, "Taylor Swift", "1989", 2014, 10.5, "Pop, Rock, Electronic");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));
    }
}