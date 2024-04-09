package org.example;

import org.example.builder.DoorWallBuilder;
import org.example.builder.MazeBuilder;
import org.example.builder.RoomBuilder;
import org.example.component.Direction;
import org.example.pojo.DoorWall;
import org.example.pojo.Maze;
import org.example.pojo.Room;
import org.example.pojo.Wall;

public class MazeGame {
    static Maze maze;
    static int num_rooms = 10;
    static int roomNo = -1;
    static Direction[] directions = {Direction.WEST, Direction.NORTH, Direction.EAST, Direction.SOUTH};

    public static void main(String[] args) {
        maze = new MazeBuilder().build();
        RoomBuilder roomBuilder = new RoomBuilder();
        roomBuilder.createRoom(++roomNo);
        Room r = roomBuilder.build();
        int numOfDoors = 0;
        while (numOfDoors < 4 && roomNo < num_rooms - 1) {
            Direction doorDirection = directions[(int) (Math.random() * 4)];
            if (r.getSide(doorDirection).getClass() != Wall.class) {
                continue;
            }
            numOfDoors++;
            maze.addRoom(r);
            createMaze(r, doorDirection);
        }
        System.out.println(maze);
    }

    static void createMaze(Room r1, Direction firstDoorDirection) {
        if (roomNo == num_rooms - 1) return;
        RoomBuilder roomBuilder = new RoomBuilder();
        roomBuilder.createRoom(++roomNo);
        Room r2 = roomBuilder.build();
        DoorWall d = new DoorWallBuilder().build(r1, r2);
        r1.setSide(firstDoorDirection, d);
        switch (firstDoorDirection) {
            case WEST -> firstDoorDirection = Direction.EAST;
            case EAST -> firstDoorDirection = Direction.WEST;
            case NORTH -> firstDoorDirection = Direction.SOUTH;
            case SOUTH -> firstDoorDirection = Direction.NORTH;
        }
        r2.setSide(firstDoorDirection, d);
        Direction secondDoorDirection = directions[(int) (Math.random() * 4)];
        maze.addRoom(r2);
        if (firstDoorDirection == secondDoorDirection) return;
        createMaze(r2, secondDoorDirection);
    }
}
