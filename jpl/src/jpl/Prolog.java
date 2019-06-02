/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Alejandro
 */
public class Prolog {
    public String h, m, p;
    public void consultar(String porcentaje){
         String t1 = "consult('matching.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
        //--------------------------------------------------
        String t4 = "pareja(H, M, " + porcentaje + ", P)";
        Query q4 = new Query(t4);
        //--------------------------------------------------
        Map<String, Term>[] ss4 = q4.allSolutions();
        System.out.println("all solutions of " + t4);
        for (Map<String, Term> ss41 : ss4) {
            System.out.println("H = " + ss41.get("H"));
            h = ss41.get("H").toString();
            System.out.println("M = " + ss41.get("M"));
            m = ss41.get("M").toString();
            System.out.println("P = " + ss41.get("P"));
            p = ss41.get("P").toString();
        }
    }
}
