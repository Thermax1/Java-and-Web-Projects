package com.example.munozpage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonData {
    private final ObjectMapper mapper;

    public JsonData(ObjectMapper mapper){
        this.mapper = mapper;
    }

    public List<Heroes> getHeroes() throws IOException {
        InputStream stream = getClass().getResourceAsStream("/data.json");
        DataWrap data = mapper.readValue(stream, DataWrap.class);
        return data.getHeroes();
    }

    public List<Factoids> getFactoids() throws IOException {
        InputStream stream = getClass().getResourceAsStream("/data.json");
        DataWrap data = mapper.readValue(stream, DataWrap.class);
        return data.getFactoids();
    }
}
