package com;

import com.GsonParser;

public class Main {
    public static void main(String[] args) {
        GsonParser gsonParser = new GsonParser();
        Root root = gsonParser.parse();
        System.out.println(root.toString());
    }
}
