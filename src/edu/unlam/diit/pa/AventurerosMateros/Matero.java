package edu.unlam.diit.pa.AventurerosMateros;

import java.util.ArrayList;

public class Matero {
	private int cantMateros;
	private ArrayList<Integer> materos;
	private int[] cantCebadas; 
			
	public Matero() {
		this.cantMateros = 0;
		this.materos = null;
		this.cantCebadas=null;
	}
	public int getCantMateros() {
		return cantMateros;
	}
	public void setCantMateros(int cantMateros) {
		this.cantMateros = cantMateros;
	}
	public int[] getCantCebadas() {
		return cantCebadas;
	}
	public void setCantCebadas(int[] cantCebadas) {
		this.cantCebadas = cantCebadas;
	}
	public void resolver(){
		
	}
}
