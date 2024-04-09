package org.example.builder;

import org.example.pojo.DoorWall;
import org.example.pojo.Room;

public class DoorWallBuilder implements Builder {

    public DoorWall build(Room r1, Room r2) {
        return new DoorWall(r1, r2);
    }
}
