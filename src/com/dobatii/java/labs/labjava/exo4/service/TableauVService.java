package com.dobatii.java.labs.labjava.exo4.service;

import com.dobatii.java.labs.labjava.exo4.data.TableauV;

/**
* 
* Outil de traitements de tableau V
* 
* @author Juoud1
*
*/

public class TableauVService {
	
	private TableauV tabV;
	
	public void lireElementsDeTableauV() {
		
		tabV = new TableauV();
		if (null == tabV.getV() || tabV.getV().length == 0) {
			System.out.println("tableau V est NULL ou vide!");
			
		} else {
			System.out.println("Lecture des éléments du tableau V est en cours ...");
			int[] V = tabV.getV();
			
			for(int i=0; i< V.length; i++) {
				System.out.println("V["+ i + "] = " + V[i]);
			}
			System.out.println("Lecture des éléments du tableau V terminée!");
			System.out.println();
			
		}
	}

}
