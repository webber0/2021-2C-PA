package edu.unlam.diit.pa.MetodosOrdenamiento;

public class MetodoOrdenamientoElementales {
	public void burbujeo(int[] array) {
		int i, j, auxiliar;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
				}
			}
		}
	}

	public void seleccion(int[] array) {
		int i, j, auxiliar;
		for (i = 0; i < array.length - 1; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					auxiliar = array[j];
					array[j] = array[i];
					array[i] = auxiliar;
				}
			}
		}
	}

	public void insercion(int[] array) {
		int i, j, auxiliar;
		for (i = 1; i < array.length; i++) {
			auxiliar = array[i];
			j = i - 1;
			while ((j >= 0) && (auxiliar < array[j])) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = auxiliar;
		}
	}
}
