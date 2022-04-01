package com;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonParser {

    public Root parse(){
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("test.json");
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
