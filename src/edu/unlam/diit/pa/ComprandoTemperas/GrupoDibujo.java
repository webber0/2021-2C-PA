package edu.unlam.diit.pa.ComprandoTemperas;

public class GrupoDibujo extends Dibujo {
	private String colorTempera;
	private int cantidadTemperas;

	public GrupoDibujo(String colorTempera) {
		super();
		this.colorTempera = colorTempera;
		this.cantidadTemperas = 0;
	}

	public String getColorTempera() {
		return colorTempera;
	}

	public void setColorTempera(String colorTempera) {
		this.colorTempera = colorTempera;
	}

	public int getCantidadTemperas() {
		return cantidadTemperas;
	}

	public void setCantidadTemperas(int cantidadTemperas) {
		this.cantidadTemperas = cantidadTemperas;
	}

	public void calcularCantidadTemperas() {
		double areaTotal = super.calcularArea();
		double restoArea = areaTotal % 100;
		this.setCantidadTemperas((int) (areaTotal / 100));
		if (restoArea > 0) {
			this.cantidadTemperas++;
		}
		if (restoArea >= 50) {
			this.cantidadTemperas++;
		}
	}

	@Override
	public String toString() {
		return "Grupo de dibujos: Color de Tempera: " + colorTempera + ", Cantidad de Temperas: " + cantidadTemperas;
	}
}
