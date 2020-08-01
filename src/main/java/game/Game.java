package game;

import armory.PlateArmour;
import enemies.Enemy;
import players.Player;
import rooms.EnemyRoom;
import rooms.Room;
import rooms.TreasureRoom;

import java.util.ArrayList;

public class Game {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Player> playableCharacters;
    private ArrayList<Enemy> nonPlayableCharacters;
    private Player player;
    private EnemyRoom enemyRoom;
    private TreasureRoom treasureRoom;

    public Game(){

        this.name = "Dark Quest";
        this.rooms = new ArrayList<Room>();
        this.playableCharacters = new ArrayList<Player>();
//        this.nonPlayableCharacters = new ArrayList<Enemy>();
        this.enemyRoom = new EnemyRoom(0.5);
        this.treasureRoom = new TreasureRoom(0.5, 100, 200);

    }

    public String getName(){
        return name;
    }

    public String welcomeToGame(){
        return "Welcome to " + name + ", if you have what it takes, let the journey begin!";
    }

    public void addRoomToRooms(Room room){
        this.rooms.add(room);
    }

    public void addPlayableCharactersToGame(Player player){
        this.playableCharacters.add(player);
    }

    public int getPlayerCount(){
        return this.playableCharacters.size();
    }

    public int gameRoomCount(){
        return this.rooms.size();
    }
}
