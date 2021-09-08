package com.kidoneself.jd.method;

import com.kidoneself.jd.util.HttpClientTool;
import lombok.Data;
import org.apache.http.Header;
import org.springframework.core.annotation.Order;

@Order(2)
public class FruitFactory {

    private static Fruit fruit;

    @Data
    static class Fruit {
        Header[] headers;


    }


    private static Fruit getFruit() {
        if (fruit == null) {
            synchronized (Fruit.class) {
                if (fruit == null) {
                    fruit = new Fruit();
                }
            }
        }
        return fruit;
    }


}
