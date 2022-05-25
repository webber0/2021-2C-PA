package edu.unlam.diit.pa.JugandoConDivisores;

public class Divisor {
	private int agustin, gaston;

	public Divisor(int valorInicial) {
		this.agustin = valorInicial;
		this.gaston = valorInicial;
	}

	public int getAgustin() {
		return agustin;
	}

	public void setAgustin(int agustin) {
		this.agustin = agustin;
	}

	public int getGaston() {
		return gaston;
	}

	public void setGaston(int gaston) {
		this.gaston = gaston;
	}

	public void resolver() {
		int N = 6, N2 = N, suma = N;
		int primo[] = calcularPrimos(N);
		int i = 0, j = primo.length - 1;
		// for (int m)
		// primero empieza gaston
		while (true) {
			// turno gaston
			while (N % primo[i] != 0) {
				i++;
			}
			N = N / primo[i];
			suma += N;
			if (N == 1) {
				break;
			}
			// turno agustin
			while (N % primo[j] != 0) {
				j--;
			}
			N = N / primo[j];
			suma += N;
			if (N == 1) {
				break;
			}
		}
		this.setGaston(suma);
		// primero empieza agustin
		i = 0;
		j = primo.length - 1;
		N = N2;
		suma = N;
		while (true) {
			// turno agustin
			while (N % primo[j] != 0) {
				j--;
			}
			N = N / primo[j];
			suma += N;
			if (N == 1) {
				break;
			}
			// turno gaston
			while (N % primo[i] != 0) {
				i++;
			}
			N = N / primo[i];
			suma += N;
			if (N == 1) {
				break;
			}
		}
		this.setAgustin(suma);
	}

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	public static int[] calcularPrimos(int numero) {
		int cantidadPrimos=0, i=2, j=0;
		int[] primos;
		if(numero == 1 || numero == 0) {
			primos=new int[1];
			primos[0]=1;
			return primos;
		}
		for(i=2;i<numero;i++) {
			if(esPrimo(i)) {
				cantidadPrimos++;
			}
		}
		primos=new int[cantidadPrimos];
		cantidadPrimos=0;
		for(i=2;i<numero;i++) {
			if(esPrimo(i)) {
				primos[j]=i;
				j++;
			}
		}
		return primos;
	}
}
