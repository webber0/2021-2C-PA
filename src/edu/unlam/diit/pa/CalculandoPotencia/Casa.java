package edu.unlam.diit.pa.CalculandoPotencia;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Habitacion> habitaciones;

	public Casa(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public Bombilla calcularBombillaMayor() {
		Bombilla bombillaMayorGeneral=new Bombilla();
		for(Habitacion h:habitaciones) {
			bombillaMayorGeneral=h.obtenerBombillaMayor().bombillaMayorConsumo(bombillaMayorGeneral);
			//Aca lo que hago es comparar contra todas las habitaciones
			//\/ esta seria otra manera
			//bombillaMayorGeneral=bombillaMayorGeneral.bombillaMayorConsumo(h.obtenerBombillaMayor()); //
		}
		return bombillaMayorGeneral;
	}
}
