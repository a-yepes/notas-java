//clase contenedor de los datos de Alumno
package pio.daw.data;

import java.util.List;

public abstract class AulaABC {
	List<AlumnoABC> alumnos;

	

	public AulaABC(List<AlumnoABC> alumnos) {
		this.alumnos = alumnos;
	}

	public List<AlumnoABC> getAlumnos() {
		return this.alumnos;
	}

	public abstract AlumnoABC getAlumno(String nombre);

	public abstract AlumnoABC getBestAlumno();

	public abstract AlumnoABC getWorstAlumno();
	


}
