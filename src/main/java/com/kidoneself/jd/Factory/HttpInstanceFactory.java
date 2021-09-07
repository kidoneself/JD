package com.kidoneself.jd.Factory;

import java.util.Map;

public class HttpInstanceFactory {
    private static HttpInstance httpInstance;


    public static class HttpInstance {
        private Map<String, String> headers;

        private String url;

        


    }


    public static HttpInstance getInstance() {
        if (httpInstance == null) {
            synchronized (HttpInstance.class) {
                if (httpInstance == null) {
                    httpInstance = new HttpInstance();
                }
            }
        }
        return httpInstance;
    }
}
