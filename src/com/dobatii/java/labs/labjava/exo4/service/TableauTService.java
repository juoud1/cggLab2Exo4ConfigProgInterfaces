package com.dobatii.java.labs.labjava.exo4.service;

import java.util.Arrays;
import com.dobatii.java.labs.labjava.exo4.data.TableauT;
import com.dobatii.java.labs.labjava.exo4.data.TableauV;

/**
* 
* Outil de traitements de tableau T
* 
* @author Juoud1
*
*/

public class TableauTService {
	
	private int indiceTemperatureMaximale;
	private int indiceTemperatureMinimale;
	
	public TableauT creerTableauT(TableauV tabV) throws Exception {
		
		int[] V = tabV.getV();
		
		if (null == V || V.length == 0) {
			System.out.println("Impossible de cr�er le tableau T : tableau V est NULL ou vide!");
			throw new Exception("Impossible de cr�er le tableau T : tableau V est NULL ou vide");
			
		} 
		
		int[] T = new int[10];
		System.out.println("Cr�ation des �l�ments du tableau T est en cours ...");
		
		for(int i=0; i< V.length; i++) {
			T[i] = V[i] / 10;
		}
		
		TableauT tabT = new TableauT();
		tabT.setT(T);
		
		System.out.println("Cr�ation des �l�ments du tableau T termin�e!");
		System.out.println();
		
		return tabT;
	}
	
	public void lireElementsDeTableauT(TableauT tabT) throws Exception {
		
		int[] T  = tabT.getT();
		
		if (null == T || T.length == 0) {
			System.out.println("tableau T est NULL ou vide!");
			throw new Exception("Impossible de cr�er le tableau T : tableau T est NULL ou vide");
		} 
		
		System.out.println("Lecture des �l�ments du tableau T est en cours ...");
		
		for(int i=0; i< T.length; i++) {
			System.out.println("T["+ i + "] = " + T[i]);
		}
		System.out.println("Lecture des �l�ments du tableau T termin�e!");
		System.out.println();
		
	}
	
	private int rechercherTemperatureMaximaleEtSonIndice (TableauT tabT) throws Exception {
		
		int[] T = tabT.getT();
		
		if (null == T || T.length == 0) {
			System.out.println("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
			throw new Exception("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
		}
		
		System.out.println("Recherche de la temp�rature maximale et son indice dans le tableau T est en cours ...");
		
		int temperatureMaximale = Integer.MIN_VALUE;
		int iTemperatureMaximale = Integer.MIN_VALUE;
		
		for (int i = 1; i < T.length; i++) {
			int x = T[i-1];
			int y = T[i];
			if(y > x) {
				temperatureMaximale = y;
				iTemperatureMaximale = i;
			} 
		}
				
		// On r�ccup�re la temperature maximale
		indiceTemperatureMaximale = iTemperatureMaximale;
		
		System.out.println("Recherche de la temp�rature maximale et son indice dans le tableeau T termin�e!");
		System.out.println();
		
		return temperatureMaximale;	
	}
	
	private int rechercherTemperatureMinimaleEtSonIndice (TableauT tabT) throws Exception {
		
		int[] T = tabT.getT();
		
		if (null == T || T.length == 0) {
			System.out.println("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
			throw new Exception("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
		}
		
		System.out.println("Recherche de la temp�rature minimale et son indice dans le tableau T est en cours ...");
		
		int temperatureMinimale = Integer.MAX_VALUE;
		int iTemperatureMinimale = Integer.MAX_VALUE;
		
		for (int i = 1; i < T.length; i++) {
			int x = T[i-1];
			int y = T[i];
			if(y < x) {
				temperatureMinimale = y;
				iTemperatureMinimale = i;
			} 
		}
				
		// On r�ccup�re la temperature minimale
		indiceTemperatureMinimale = iTemperatureMinimale;
		
		System.out.println("Recherche de la temp�rature minimale et son indice dans le tableeau T termin�e!");
		System.out.println();
		
		return temperatureMinimale;	
	}
	
	public void afficherTemperatureMaximale(TableauT tabT) {
		try {
			int temperatureMax = rechercherTemperatureMaximaleEtSonIndice(tabT);
			System.out.println("La temp�rature maximale dans le tableeau T = " + temperatureMax + "�C");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public void afficherIndiceTemperatureMaximale() {
		
		try {
			System.out.println("L'indice de la temp�rature maximale dans le tableeau T = " + indiceTemperatureMaximale);
			System.out.println();
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public void afficherTemperatureMinimale(TableauT tabT) throws Exception {
		
		try {
			int temperatureMin = rechercherTemperatureMinimaleEtSonIndice(tabT);
			System.out.println("La temp�rature minimale dans le tableeau T = " + temperatureMin + "�C");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	private int calculerMoyenneTemperature (TableauT tabT) throws Exception {
		
		int[] T = tabT.getT();
		
		if (null == T) {
			System.out.println("Impossible de calculer la moyenne : le tableau T est NULL!");
			throw new Exception("Impossible de calculer la moyenne : le tableau T est NULL!");
		}
		
		System.out.println("Calcul de la moyenne des temp�ratures en cours ...");
		
		int sommeTemperature = 0;
		for (int i = 0; i < T.length - 1; i++) {
			sommeTemperature += T[i];
		}
		
		int moyenneTemperature = sommeTemperature / T.length;
		System.out.println("Calcul de la moyenne des temp�ratures termin�e!");
		System.out.println();
		
		return moyenneTemperature;
		
	}
	
	public void afficherMoyenneTemperature (TableauT tabT) {
		
		try {
			System.out.println("La moyenne des temp�ratures = " + calculerMoyenneTemperature(tabT) + "�C");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public TableauT trierTableauTParOrdreDecroissant (TableauT tabT) throws Exception {
		
		int[] T = tabT.getT();
		
		if (null == T || T.length == 0) {
			System.out.println("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
			throw new Exception("Impossible de trouver le maximum dans le tableau T est NULL ou vide!");
		}
		
		System.out.println("Tri du tableau T par ordre d�croissant en cours ...");
		
		// On trie le tableau
		Arrays.sort(T);
		
		int[] R = new int[T.length];
		int j = 0;
		
		for(int i = T.length-1; i >= 0; i--) {
			R[j] = T[i];
			j++;
		}
	
		// On cr�e le tableau tri� par ordre d�croissant
		TableauT tabR = new TableauT();
		tabR.setT(R);
		
		System.out.println("Tri du tableau T par ordre d�croissant est termin�e!");
		System.out.println();
		
		return tabR;
		
	}
	
	
}
