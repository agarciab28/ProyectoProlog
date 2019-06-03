/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Alejandro
 */
public class Prolog {

    public String h="", m="", p="";

    public void consultar(String porcentaje) {
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

    public void consultarHombre(String porcentaje, String H) {
        p="";
        h="";
        m="";
        String t1 = "consult('matching.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
        //--------------------------------------------------
        String t4 = "pareja(" + H + ", M, " + porcentaje + ", P).";
        Query q4 = new Query(t4);
        //--------------------------------------------------
        Map<String, Term>[] ss4 = q4.allSolutions();
        System.out.println("all solutions of " + t4);
        int aux=1;
        for (Map<String, Term> ss41 : ss4) {
            System.out.println("M = " + ss41.get("M"));
            m +=aux+": "+ ss41.get("M").toString()+", \n";
            System.out.println("P = " + ss41.get("P"));
            p +=aux+": "+ ss41.get("P").toString()+", \n";
            aux++;
        }
    }

    public void consultarMujer(String porcentaje, String M) {
        p="";
        h="";
        m="";
        String t1 = "consult('matching.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
        //--------------------------------------------------
        String t4 = "pareja(H, " + M + ", " + porcentaje + ", P)";
        Query q4 = new Query(t4);
        //--------------------------------------------------
        Map<String, Term>[] ss4 = q4.allSolutions();
        System.out.println("all solutions of " + t4);
        int aux=1;
        for (Map<String, Term> ss41 : ss4) {
            System.out.println("H = " + ss41.get("H"));
            h+=aux+": "+ ss41.get("H").toString()+", \n";
            System.out.println("P = " + ss41.get("P"));
            p +=aux+": "+ ss41.get("P").toString()+", \n";
            aux++;
        }
        
    }

    public void guardaPersonas(String sexo, String nombre) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter("matching.pl", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            if (sexo.equals("Hombre")) {
                bfwriter.write("\nhombre(" + nombre + "). \n");
            } else {
                bfwriter.write("\nmujer(" + nombre + "). \n");
            }
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardaGustos(String nombre, String gustos) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter("matching.pl", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            bfwriter.write("\ngustos(" + nombre + ",[" + gustos + "]).");

            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardaMusica(String nombre, String musica) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter("matching.pl", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            bfwriter.write("\nmusica(" + nombre + ",[" + musica + "]).");

            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardaComida(String nombre, String comida) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter("matching.pl", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            bfwriter.write("\ncomida(" + nombre + ",[" + comida + "]).");

            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void iniciaProlog() {
        String t1 = "consult('matching.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
    }

    public String getGustos(String nombre) {
        String t4 = "gustos(" + nombre + ", X)";
        Query q4 = new Query(t4);
        //--------------------------------------------------

        System.out.println("each solution of " + t4);
        while (q4.hasMoreSolutions()) {
            Map<String, Term> s5 = q4.nextSolution();
            //Map<String,Term>[] s5 = q5.nextSolution();
            System.out.println("X = " + s5.get("gustos"));
        }

        return "";
    }
}
