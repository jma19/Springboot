package com.im.server.utils;

import com.google.gson.Gson;

/**
 * Created by majun on 16/1/16.
 */
public class JsonUtils {
    private JsonUtils() {
    }

    private final static Gson gson = new Gson();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T toObject(String json, Class<T> clas) {
        return gson.fromJson(json, clas);
    }
}
