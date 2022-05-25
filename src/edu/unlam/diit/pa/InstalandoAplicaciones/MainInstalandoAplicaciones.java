package edu.unlam.diit.pa.InstalandoAplicaciones;

public class MainInstalandoAplicaciones {
	public static void main(String[] args) {
		Aplicacion app=null;
		GestorArchivos ga = new GestorArchivos();
		ga.generarCasoFatiga();
		app=ga.LeerArchivo("almacenamiento.in");	
		app.resolver();
	}
}
