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

public class Skiers {
    
    private List<Participant> skiers;

    public Skiers() {
        skiers = new ArrayList<Participant>();
    }
    
    public void add(Participant participant) {
        skiers.add(participant);
    }
    
    public void sort() {
        Collections.sort(skiers);
    }
    
    public void reverseSort() {
        Collections.reverse(skiers);
    }
    
    public int size() {
        return skiers.size();
    }
    
    private int getIndex(Participant participant) {
        return skiers.indexOf(participant) + 1;
    }
    
    public void print() {
        for (Participant participant : skiers) {
                System.out.println("  " + getIndex(participant) + ". " + participant + " (" + participant.getPoints() + " points)");
            }
    }
    
    public Participant getSkier(int i) {
        return skiers.get(i);
    }
    
}
