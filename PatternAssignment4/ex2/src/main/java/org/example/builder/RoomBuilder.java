package org.example.builder;

import org.example.component.Direction;
import org.example.pojo.Room;
import org.example.pojo.Wall;

public class RoomBuilder implements Builder {
    private Room r;
    private Direction[] directions = {Direction.WEST, Direction.NORTH, Direction.EAST, Direction.SOUTH};

    public void createRoom(int roomNo) {
        r = new Room(roomNo);
    }

    public void setSide(Direction direction, Wall wall) {
        r.setSide(direction, wall);
    }

    public Room build() {
        for (Direction direction : directions) {
            setSide(direction, new Wall());
        }
        return r;
    }
}
