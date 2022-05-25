package edu.unlam.diit.pa.ArmandoMoviles;

import java.util.HashMap;

public class Movil {
	private HashMap<Integer, Integer> pesoMap = new HashMap<Integer, Integer>();
	private int cantMoviles;
	private int pesoTotal;
	private String salida;

	public void setPesoMap(HashMap<Integer, Integer> p) {
		this.pesoMap = p;
	}

	public void resolver() {		
		for (HashMap.Entry<Integer, Integer> valor : pesoMap.entrySet()) {
			if(valor.getValue() / 2 >= 1){
				cantMoviles += valor.getValue() / 2;
				pesoTotal += valor.getKey() * valor.getValue();
			}
		}
		if(cantMoviles == 0){
			salida = "No se puede";
		}
	}

	public int getCantMoviles() {
		return cantMoviles;
	}

	public int getPesoTotal() {
		return pesoTotal;
	}

	public String salida() {
		return salida;
	}
}
