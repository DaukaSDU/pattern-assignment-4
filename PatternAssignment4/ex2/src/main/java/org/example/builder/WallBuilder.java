package org.example.builder;

import org.example.pojo.Wall;

public class WallBuilder implements Builder {

    public Wall build() {
        return new Wall();
    }
}
