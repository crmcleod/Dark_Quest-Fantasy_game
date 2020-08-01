import armory.*;
import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;
import game.Game;
import healingTools.Herbs;
import healingTools.Potion;
import players.*;
import rooms.EnemyRoom;
import rooms.TreasureRoom;
import spells.Fireball;

import javax.swing.*;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        Axe axe = new Axe(50);
        Club club = new Club(40);
        Pickaxe pickaxe = new Pickaxe(40);
        PlateArmour plateArmour = new PlateArmour(20);
        Sword sword = new Sword(50);
        Orc orc = new Orc("Gub", 200);
        Troll troll = new Troll("Raccballir", 250);
        Herbs herbs = new Herbs();
        Potion potion = new Potion(50);
        Barbarian barbarian = new Barbarian("Conan", 100,0);
        Cleric cleric = new Cleric("Myrl", 75, 50);
        Dwarf dwarf = new Dwarf("Gimlet", 150, 150, pickaxe);
        Knight knight = new Knight ("Alysses", 100, 10, plateArmour);
        Warlock warlock = new Warlock("Rannark", 75, 5);
        Wizard wizard = new Wizard("Rincewind", 50, 67);
        EnemyRoom enemyRoom =  new EnemyRoom(0.5);
        TreasureRoom treasureRoom = new TreasureRoom(0.5, 100, 100);
        Fireball fireball = new Fireball(100);

        System.out.println(game.welcomeToGame());
        System.out.println("continue/exit");

        String input = scanner.next();
        if (input == "exit"){
            System.exit(0);
        }
        System.out.println("Wind whistles through the cracked stonework of the ancient city walls.");
        System.out.println("You and your band of hardened adventurers have been tasked to make your way through an ancient network of caves.");
        System.out.println("Do you wish to begin your quest now or partake of the local tavern first? (quest/tavern)");

        String tavern = scanner.next();
        if (tavern != "quest"){
            System.out.println("You are immediately kicked out by the landlord. It seems you have been here before...");
        }

        System.out.println("continue (y/n)");
        String quest = scanner.next();
        if (quest == "n"){
            System.exit(0);
        }

        System.out.println("An Orc blocks your path, he hasn't noticed you yet. Quickly attack him.");
        System.out.println("Will you use the wizard, knight, dwarf, warlock or barbarian?");
        String fighter = scanner.next();
        if (fighter.equals("wizard")){
            System.out.println(wizard.impersonateGandalf());}
            else if (fighter.equals("knight")){
                knight.attack(sword, orc);
            }
            if (fighter.equals("dwarf")){
                dwarf.attack(axe, orc);
            }
            if (fighter.equals("barbarian")){
                System.out.println(barbarian.ripEnemiesHeadOff(orc));
            }
            if (fighter.equals("warlock")){
                warlock.attack(fireball, orc);
            }
        System.out.println("You get a surprise attack on the orc, they have " + orc.checkHealth() + " health remaining");
        System.out.println("Attack again? Pick your fighter!");
        String fighter2 = scanner.next();
        if (fighter2.equals("wizard")){
            System.out.println(wizard.impersonateGandalf());}
        else if (fighter2.equals("knight")){
            knight.attack(sword, orc);
        }
        if (fighter2.equals("dwarf")){
            dwarf.attack(axe, orc);
        }
        if (fighter2.equals("barbarian")){
            System.out.println(barbarian.ripEnemiesHeadOff(orc));
        }
        if (fighter2.equals("warlock")){
            warlock.attack(fireball, orc);
        }
        System.out.println("You get a surprise attack on the orc, they have " + orc.checkHealth() + " health remaining");



        String inputEnd = scanner.next();

    }
}
