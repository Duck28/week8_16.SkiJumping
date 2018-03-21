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

public class Participant implements Comparable<Participant>{
    
    private String name;
    private int points;
    private List<Integer> jumps;
    private Random random;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
        jumps = new ArrayList<Integer>();
        random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    
    @Override
    public int compareTo(Participant other) {
        return getPoints() - other.getPoints();
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public int jump() {
        int jump = random.nextInt(61) + 60;
        jumps.add(jump);
        this.points += jump;
        return jump;   
    }
    
    public List<Integer> score() {
        List<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            scores.add(random.nextInt(11) + 10);
        }
        Collections.sort(scores);
        this.points += scores.get(1) + scores.get(2) + scores.get(3);
        return scores;
    }
    
    public void printJumps() {
        for (int i = 0; i < jumps.size() - 1; i++) {
            System.out.print(jumps.get(i) + " m, ");
        }
        System.out.println(jumps.get(jumps.size() - 1) + " m");
    }
    
}
