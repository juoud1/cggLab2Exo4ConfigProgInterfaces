package com.dobatii.java.labs.labjava.exo4;

import com.dobatii.java.labs.labjava.exo4.data.TableauT;
import com.dobatii.java.labs.labjava.exo4.data.TableauV;
import com.dobatii.java.labs.labjava.exo4.service.TableauTService;
import com.dobatii.java.labs.labjava.exo4.service.TableauVService;

public class LabJavaExo4Main {
	
	public static void main(String[] args) throws Exception {
		
		// Lecture des 10 éléments du tableau V
		TableauVService tabVService = new TableauVService();
		tabVService.lireElementsDeTableauV();
		
		// Création du tableau T
		TableauV tabV = new TableauV();
		TableauTService tabTService = new TableauTService();
		TableauT tabT = tabTService.creerTableauT(tabV);
		// Lecture des 10 températures dans le tableau T
		tabTService.lireElementsDeTableauT(tabT);
		
		// Affichage de la température maximale parmi les 10 températures
		tabTService.afficherTemperatureMaximale(tabT);
		
		// Affichage de l'indice ou se trouve la température maximale parmi les 10 températures
		tabTService.afficherIndiceTemperatureMaximale();
		
		// Affichage de la température minimale parmi les 10 températures
		tabTService.afficherTemperatureMinimale(tabT);
		
		// Affichage de la moyenne des 10 températures
		tabTService.afficherMoyenneTemperature(tabT);
		
		//Tri du tableau T par ordre décroissant
		TableauT tabTrierParOrdreDecroissant = tabTService.trierTableauTParOrdreDecroissant(tabT);
		// Lecture du tableau T trié par ordre décroissant
		tabTService.lireElementsDeTableauT(tabTrierParOrdreDecroissant);
		
	}

}
