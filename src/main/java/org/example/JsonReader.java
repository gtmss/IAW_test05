package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class JsonReader {
    ObjectMapper objectMapper = new ObjectMapper();
    public void readConditions() throws IOException {
        Conditions conditions = objectMapper.readValue(new File("src/main/resources/conditions.json"), Conditions.class);
        var extensions = conditions.getConditions();
    }
}
