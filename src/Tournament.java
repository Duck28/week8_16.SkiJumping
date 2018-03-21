/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
import java.util.*;

public class Tournament {

    public void start() {

        Reader reader = new Reader();
        Skiers skiers = new Skiers();

        System.out.println("Kumpula ski jumping week");
        System.out.println("");

        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.read();
            if (name.isEmpty()) {
                break;
            }
            skiers.add(new Participant(name));
        }

        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");

        int round = 1;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.read();
            if (!command.equals("jump")) {
                System.out.println("");
                break;
            }
            System.out.println("");
            System.out.println("Round " + round);
            System.out.println("");

            System.out.println("Jumping order:");
            skiers.print();

            System.out.println("");
            System.out.println("Results of round " + round);
            for (int i = 0; i < skiers.size(); i++) {
                System.out.println("  " + skiers.getSkier(i));
                System.out.println("    length: " + skiers.getSkier(i).jump());
                System.out.println("    judge votes: " + skiers.getSkier(i).score());
            }
            skiers.sort();
            round++;
            System.out.println("");
        }

        System.out.println("Thanks!");
        System.out.println("");
        skiers.reverseSort();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (int i = 0; i < skiers.size(); i++) {
            System.out.println(i+1 + "           " + skiers.getSkier(i) + " (" + skiers.getSkier(i).getPoints() + ")");
            System.out.print("            jump lengths: ");
            skiers.getSkier(i).printJumps();
        }
    }

}
