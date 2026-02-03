
package pio.daw.data;

import java.util.List;
import java.io.File;

import pio.daw.stats.EstadisticaBasica;
import pio.daw.stats.Graficable;

public class Aula extends AulaABC implements EstadisticaBasica, Graficable {
    
    public static Aula fromFile(File file){//metodo para leer la ruta. Devuelve un objeto ruta
        
       
        //printf("El mejor alumno %s", a.getMejor()). Igual con el peor
    }
    
    public Aula (List <AlumnoABC> alumnos){
        super(alumnos);
    }
        
	public abstract AlumnoABC getAlumno(String nombre);
	return Alumno;
    public abstract AlumnoABC getBestAlumno();
	//devuelve alumno mejor media
    public abstract AlumnoABC getWorstAlumno();
    //devuelve alumno peor media
	public abstract Double getMedia();
    //devuelve media de la clase
	public abstract Double getMax();
    //devuelve nota max de la clase
	public abstract Double getMin();
    //devuelve nota minima de la clase
	public abstract Double getVar();
    //devuelve varianza de la clase
    public void printBarPlot();
    //imprime tabla


}
        return null;
    }
}
