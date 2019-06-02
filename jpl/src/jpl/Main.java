/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl;

/**
 *
 * @author Alejandro
 */
import Vistas.index;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

public class Main {

    public static void main(String argv[]) {
        Consultas cons = new Consultas();
       index menu = new index(cons);
       menu.setLocationRelativeTo(null);
       menu.setVisible(true);
    }
    
    
}
