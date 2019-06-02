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
public class Consultas {
    public void consultar(){
         String t1 = "consult('matching.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
        //--------------------------------------------------
        String t4 = "pareja(H, M, 50, Var)";
        Query q4 = new Query(t4);
        System.out.println("first solution of " + t4 + ": H = "
                + q4.oneSolution().get("H"));
        //--------------------------------------------------
        Map<String, Term>[] ss4 = q4.allSolutions();
        System.out.println("all solutions of " + t4);
        for (Map<String, Term> ss41 : ss4) {
            System.out.println("H = " + ss41.get("H"));
            System.out.println("M = " + ss41.get("M"));
            System.out.println("Var = " + ss41.get("Var"));
        }
    }
}
