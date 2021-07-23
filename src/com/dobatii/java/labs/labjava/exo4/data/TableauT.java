package com.dobatii.java.labs.labjava.exo4.data;

public class TableauT {
	
	private int[] T = new int[10];

	public TableauT() {
		super();
	}

	public int[] getT() {
		return T;
	}

	public void setT(int[] t) throws Exception {
		if (null == t || t.length == 0) {
			System.out.println("Impossible de créer le tableau T : le paramètre est NULL ou vide!");
			throw new Exception("Impossible de créer le tableau T : le paramètre est NULL ou vide");	
		}
		
		for(int i=0; i< T.length; i++) {
			T[i] = t[i];
		}
	}
	
}
