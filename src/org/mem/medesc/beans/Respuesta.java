package org.mem.medesc.beans;

public class Respuesta {

	long idMedicion;
	long idPregunta;
	long idAlternativa;
	int tipo;
	int orden;
	long duracion;
	int grafo;
	
	int unidad;
	Alternativa contestada;
	
	public Respuesta() { }

	public Respuesta(long idMedicion, long idPregunta, long idAlternativa,
			int tipo, int orden, long duracion, int grafo, int unidad, Alternativa contestada) {
		super();
		this.idMedicion = idMedicion;
		this.idPregunta = idPregunta;
		this.idAlternativa = idAlternativa;
		this.tipo = tipo;
		this.orden = orden;
		this.duracion = duracion;
		this.grafo = grafo;
		this.unidad = unidad;
		this.contestada = contestada;
	}
	
	

	public Alternativa getContestada() {
		return contestada;
	}

	public void setContestada(Alternativa contestada) {
		this.contestada = contestada;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public int getGrafo() {
		return grafo;
	}

	public void setGrafo(int grafo) {
		this.grafo = grafo;
	}

	public long getIdMedicion() {
		return idMedicion;
	}

	public void setIdMedicion(long idMedicion) {
		this.idMedicion = idMedicion;
	}

	public long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public long getIdAlternativa() {
		return idAlternativa;
	}

	public void setIdAlternativa(long idAlternativa) {
		this.idAlternativa = idAlternativa;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Respuesta [idMedicion=" + idMedicion + ", idPregunta="
				+ idPregunta + ", idAlternativa=" + idAlternativa + ", tipo="
				+ tipo + ", orden=" + orden + ", duracion=" + duracion
				+ ", grafo=" + grafo + ", unidad=" + unidad + ", contestada="
				+ contestada + "]";
	}

	

	
	
}
