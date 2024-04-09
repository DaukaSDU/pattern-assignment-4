package org.example.builder;

import org.example.pojo.Maze;
import org.example.pojo.Room;

public class MazeBuilder implements Builder {
    private Maze maze = new Maze();

    public void addRoom(Room r) {
        maze.addRoom(r);
    }

    public Maze build() {
        return maze;
    }
}
