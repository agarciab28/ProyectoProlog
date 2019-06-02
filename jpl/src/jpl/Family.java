/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl;

/**
 *
 * @author gtnra
 */

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;
public class Family
{
 public static void main( String argv[] )
 {
 String t1 = "consult('family.pl')";
 Query q1 = new Query(t1);
 System.out.println( t1 + " " + (q1.hasSolution() ? "succeeded" : "failed") );
 //--------------------------------------------------
 String t2 = "child_of(joe, ralf)";
 Query q2 = new Query(t2);
System.out.println( t2 + " is " + (q2.hasSolution() ? "provable" : "not provable") );
 //--------------------------------------------------
 String t3 = "descendent_of(steve, ralf)";
 Query q3 = new Query(t3);
System.out.println( t3 + " is " +(q3.hasSolution() ? "provable" : "not provable") );
 //--------------------------------------------------
 String t4 = "descendent_of(X, ralf)";
 Query q4 = new Query(t4);
System.out.println( "first solution of " + t4 + ": X = " +
q4.oneSolution().get("X"));
 //--------------------------------------------------
     Map<String, Term>[] ss4 =q4.allSolutions();
 System.out.println( "all solutions of " + t4); 
     for (Map<String, Term> ss41 : ss4) {
         System.out.println("X = " + ss41.get("X"));
     }
 //--------------------------------------------------
 System.out.println( "each solution of " + t4);
while ( q4.hasMoreSolutions() ){
     Map<String, Term> s4 = q4.nextSolution();
System.out.println( "X = " + s4.get("X"));
 }
 //--------------------------------------------------
String t5 = "descendent_of(X,Y)";
Query q5 = new Query(t5);
 System.out.println( "each solution of " + t5 );
while ( q5.hasMoreSolutions() ){
     Map<String, Term> s5 = q5.nextSolution();
 //Map<String,Term>[] s5 = q5.nextSolution();
System.out.println( "X = " + s5.get("X") + ", Y = " + s5.get("Y"));
 }
 }
}
