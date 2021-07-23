package com.dobatii.java.labs.labjava.exo4;

import com.dobatii.java.labs.labjava.exo4.data.TableauT;
import com.dobatii.java.labs.labjava.exo4.data.TableauV;
import com.dobatii.java.labs.labjava.exo4.service.TableauTService;
import com.dobatii.java.labs.labjava.exo4.service.TableauVService;

public class LabJavaExo4Main {
	
	public static void main(String[] args) throws Exception {
		
		// Lecture des 10 �l�ments du tableau V
		TableauVService tabVService = new TableauVService();
		tabVService.lireElementsDeTableauV();
		
		// Cr�ation du tableau T
		TableauV tabV = new TableauV();
		TableauTService tabTService = new TableauTService();
		TableauT tabT = tabTService.creerTableauT(tabV);
		// Lecture des 10 temp�ratures dans le tableau T
		tabTService.lireElementsDeTableauT(tabT);
		
		// Affichage de la temp�rature maximale parmi les 10 temp�ratures
		tabTService.afficherTemperatureMaximale(tabT);
		
		// Affichage de l'indice ou se trouve la temp�rature maximale parmi les 10 temp�ratures
		tabTService.afficherIndiceTemperatureMaximale();
		
		// Affichage de la temp�rature minimale parmi les 10 temp�ratures
		tabTService.afficherTemperatureMinimale(tabT);
		
		// Affichage de la moyenne des 10 temp�ratures
		tabTService.afficherMoyenneTemperature(tabT);
		
		//Tri du tableau T par ordre d�croissant
		TableauT tabTrierParOrdreDecroissant = tabTService.trierTableauTParOrdreDecroissant(tabT);
		// Lecture du tableau T tri� par ordre d�croissant
		tabTService.lireElementsDeTableauT(tabTrierParOrdreDecroissant);
		
	}

}
