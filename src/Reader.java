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

public class Reader {
    
    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }
    
    public String read() {
        String string = reader.nextLine();
        return string;
    }
    
    
    
}
