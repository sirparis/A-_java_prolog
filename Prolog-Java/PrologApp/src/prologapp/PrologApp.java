/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prologapp;

import java.util.Map;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Billtzi
 */
public class PrologApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String argv[]) {
		// JPL.setTraditional();
		//
		Query.hasSolution("use_module(library(jpl))"); 
		Term swi = Query.oneSolution("current_prolog_flag(version_data,Swi)").get("Swi");
		System.out.println("swipl.version = " + swi.arg(1) + "." + swi.arg(2) + "." + swi.arg(3));
		System.out.println("swipl.syntax = " + Query.oneSolution("jpl_pl_syntax(Syntax)").get("Syntax"));
		System.out.println("swipl.home = " + Query.oneSolution("current_prolog_flag(home,Home)").get("Home").name());
		System.out.println("jpl.jar = " + JPL.version_string());
		System.out.println("jpl.dll = " + org.jpl7.fli.Prolog.get_c_lib_version());
		System.out.println("jpl.pl = " + Query.oneSolution("jpl_pl_lib_version(V)").get("V").name());
		//
		String t1 = "consult('move.pl')";
		System.out.println(t1 + " " + (Query.hasSolution(t1) ? "succeeded" : "failed"));
		String t2 = "move(3,left,right,center)";
		Map<String, Term>[] ss4 = Query.allSolutions(t2);
		System.out.println("all solutions of " + t2);
//		
	}
    
}
