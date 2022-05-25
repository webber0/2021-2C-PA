package edu.unlam.diit.pa.MetodosOrdenamiento;

public class MetodoOrdenamientoNoElementales {
	public void shell(int[] array) {
		int salto, i, j, k, auxiliar;
		salto = array.length / 2;
		while (salto > 0) {
			for (i = salto; i < array.length; i++) {
				j = i - salto;
				while (j >= 0) {
					k = j + salto;
					if (array[j] <= array[k]) {
						j = -1;
					} else {
						auxiliar = array[j];
						array[j] = array[k];
						array[k] = auxiliar;
						j -= salto;
					}
				}
			}
			salto = salto / 2;
		}

	}

	public void quicksort(int izquierda, int derecha, int[] array) {
		int i = izquierda, j = derecha, pivote = array[(izquierda + derecha) / 2], auxiliar;
		do {
			while (array[i] < pivote) {
				i++;
			}
			while (array[j] > pivote) {
				j--;
			}
			if (i <= j) {
				auxiliar = array[i];
				array[i] = array[j];
				array[j] = auxiliar;
				i++;
				j--;
			}

			if (izquierda < j) {
				this.quicksort(izquierda, j, array);
			}

			if (derecha > i) {
				this.quicksort(i, derecha, array);
			}

		} while (i <= j);

	}

	public void mergesort(int[] array, int izquierda, int derecha) {
		if (izquierda < derecha) {
			int medio = (izquierda + derecha) / 2;
			this.mergesort(array, izquierda, medio);
			this.mergesort(array, medio + 1, derecha);
			this.merge(array, izquierda, medio, derecha);
		}
	}

	public void merge(int[] array, int izquierda, int medio, int derecha) {
		int left = medio - izquierda + 1, right = derecha - medio, i, j, k = izquierda;
		int[] arrayIzquierdo = new int[left];
		int[] arrayDerecho = new int[right];

		for (i = 0; i < left; ++i) {
			arrayIzquierdo[i] = array[izquierda + i];
		}

		for (j = 0; j < right; ++j) {
			arrayDerecho[j] = array[medio + 1 + j];
		}
		i = 0;
		j = 0;
		while (i < left && j < right) {
			if (arrayIzquierdo[i] <= arrayDerecho[j]) {
				array[k] = arrayIzquierdo[i];
				i++;
			} else {
				array[k] = arrayDerecho[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			array[k] = arrayIzquierdo[i];
			i++;
			k++;
		}

		while (j < right) {
			array[k] = arrayDerecho[j];
			j++;
			k++;
		}
	}
}
