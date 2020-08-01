package game;

import players.Player;
import rooms.Room;

import java.util.ArrayList;

public class Game {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Player> playableCharacters;
//    private ArrayList<Enemy> nonPlayableCharacters;

    public Game(){
        this.name = "Dark Quest";
    }

    public String getName(){
        return name;
    }

    public String welcomeToGame(){
        return "Welcome to " + name + ", if you have what it takes, let the journey begin!";
    }
}
