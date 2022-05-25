package edu.unlam.diit.pa.CalculandoPotencia;

import java.util.ArrayList;

public class Habitacion {
	private ArrayList<Bombilla> bombillaHabitacion;

	public Habitacion(ArrayList<Bombilla> bombillaHabitacion) {
		this.bombillaHabitacion = bombillaHabitacion;
	}

	public ArrayList<Bombilla> getBombillaHabitacion() {
		return bombillaHabitacion;
	}

	public void setBombillaHabitacion(ArrayList<Bombilla> bombillaHabitacion) {
		this.bombillaHabitacion = bombillaHabitacion;
	}

	public Bombilla obtenerBombillaMayor() {
		Bombilla bombillaMayorHabitacion = new Bombilla();
		for (Bombilla b : bombillaHabitacion) {
			bombillaMayorHabitacion = b.bombillaMayorConsumo(bombillaMayorHabitacion);
		}
		return bombillaMayorHabitacion;
	}
}
